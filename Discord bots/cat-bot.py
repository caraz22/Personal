from discord.ext import commands
import discord
# import requests

BOT_TOKEN = "MTA5MTM2Njc0ODI0ODM1NDg0Ng.GZFSvh.QTRI2qeA7BWX07PcPA7r0VIBL8o66x4yqlHnuQ"
CHANNEL_ID = 1091388078049996822

bot = commands.Bot(command_prefix="!", intents=discord.Intents.all() )

@bot.event
async def on_ready():
    print("Ready to count!")
    channel = bot.get_channel(CHANNEL_ID)
    await channel.send("Ready to count!")

# @bot.event
# async def on_message(message):
#     global cat_gif_count, total_message_count

#     if message.author == bot.user:
#         return
    
#     total_message_count += 1

#     if 'https://tenor.com/view/' in message.content and 'cat' in message.content:
#         gif_id = message.content.split('-')[-1].split('/')[0]
#         response = requests.get('https:api.tenor.com/v1.gifs/{}'.format(gif_id)).json()
#         if response['tags'] and 'cat' in response['tags']:
#             cat_gif_count += 1
#             await message.channel.send('Meow! Cat gif count: {}/{}. Cat gif percentage: {:.2f%}'.format(cat_gif_count, total_message_count, cat_gif_count/total_message_count*100))

@bot.command()
async def startCounting(ctx):
    await ctx.send("ᨐᵉᵒʷ! I'm ready to count!.")
    await bot.change_presence(status=discord.Status.online, activity=discord.Game(name='Counting cat gifs'))

@bot.command()
async def stopCounting(ctx):
    await ctx.send('ᨐᵉᵒʷ! I am no longer counting.')
    await bot.change_presence(status=discord.Status.idle)

# @bot.command()
# async def countStatus(ctx):
#     await ctx.send('ᨐᵉᵒʷ! Total message count: {}. Cat gif count: {}. Cat gif percentage: {:.2f}%'.format(total_message_count, cat_gif_count, cat_gif_count/total_message_count*100))

# @bot.command()
# async def status_commands(command):
#     if command.content == 'startCounting':
#         await command.channel.send("ᨐᵉᵒʷ! I'm ready to count!.")
#         await bot.change_presence(status=discord.Status.online, activity=discord.Game(name='Counting cat gifs'))
#     elif command.content == 'stopCounting':
#         await command.channel.send('ᨐᵉᵒʷ! I am no longer counting.')
#         await bot.change_presence(status=discord.Status.idle)
#     elif command.content == 'countStatus':
#         await command.channel.send('ᨐᵉᵒʷ! Total message count: {}. Cat gif count: {}. Cat gif percentage: {:.2f}%'.format(total_message_count, cat_gif_count, cat_gif_count/total_message_count*100))


bot.run(BOT_TOKEN)