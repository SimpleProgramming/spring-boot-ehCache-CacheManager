# Spring Boot - EhCache (Java Configuration) with CacheManager Configurations, Expiry, etc

@Cacheable
@CacheEvit
@CachePut

A simple example to use ehCache CacheManager with multiple caches with expiry time

let us see how to use cache in an API project

there are different cache mechanisms available in the market for you to make use of, like ehcache redis, HazelCast, CouchBase, Gemfire, etc

In this example we will look into cache in two parts, in the first part we will look at the auto-configuration inbuilt cache functionality and in the next part we will see how to use cache manger to configure multiple caches and how to set expiry for them and for this i will use ehCache with java configurations, 

before we jump into hands on lets discuss a common topic that many developers are confused about
What is the difference between Cache and a Cookie

Cookie - used to store user details

Cache - used to store information to render the page faster

Cookies often track information like how frequently the user visits, what are the times of visits, what banners have been clicked on, what button clicked, user preferences, items in shopping cart, etc
Example would be youtube, or facebook. They show ads based on the information available in your cookies.
lets say you visited amazon.com and you were looking into some shoes, and after some time you open up a facebook page
you would have noticed that facebook would show ads related to shoes in their page how is that done. 
well this is where cookie comes of use

Whereas in case of Cache,

For example, when you open websites with large pictures and video’s or a page with huge data that takes some time to render in front of you, it might take some time to load the website.
Here we can use cache to stores the site contents like the images, videos, audio, huge data etc. on your computer. So the next time you load the same website you will find it loading faster

Both cookie and cache can have an expiry time limit, depending upon ur business needs


Cache Eviction Policy

- A cache eviction algorithm is a way of deciding which element to evict when the cache is full.

Cache Entries On Local Heap

- The maximum number of cache entries or bytes a cache can use in local heap memory, or, when set at the CacheManager level (maxBytesLocalHeap only), a local pool available to all caches under that CacheManager. This setting is required for every cache or at the CacheManager level.


Caching Replacement Algorithms - 
https://en.wikipedia.org/wiki/Cache_replacement_policies#Least-frequently_used_(LFU)

Ehcache Documentation Cache Size - 
https://www.ehcache.org/documentation/2.7/configuration/cache-size.html

EhCache Eviction Algorithms Documentation - 
https://www.ehcache.org/documentation/2.8/apis/cache-eviction-algorithms.html
