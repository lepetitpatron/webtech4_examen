from django.shortcuts import render
from django.http import HttpResponse

import string

# Create your views here.
def brexit(request):    
    output = '<h1>Brexit means brexit</h1>'
   
    return HttpResponse(output)