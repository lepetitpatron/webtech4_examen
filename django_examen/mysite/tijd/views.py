from django.shortcuts import render
from django.http import HttpResponse

import datetime

# Create your views here.
def brexit(request):    
    now = datetime.datetime.now()
    brexit = datetime.datetime(2019,3,30,0,0,0)
    result = (brexit - now)

    seconds = result.total_seconds()
    hours = int(seconds // 3600)
    minutes = int((seconds % 3600) // 60)
    seconds = int(seconds % 60)

    output = '<p>'+str(hours)+':'+str(minutes)+':'+str(seconds)+'</p>'

    return HttpResponse(output)