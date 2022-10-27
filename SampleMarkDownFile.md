Element Markdown Syntax

Heading 
# Header 1
## Header 2
### Header 3
___

Bold **bold text**
___

Italic *italicized text*
___

Blockquote 
> blockquote
>>2.blockquote
>>>3.blockquote
> >>1. first step
> >>2. second step
> >>3. third step
___
The world is ~~flat~~ round. (~~ ... ~~)

___

Ordered List
1. First item
2. Second item
3. Third item
___

Unordered List 
- First item
- Second item
- Third item
* First
* Second
* Third
- First
- Second
- Third
+ First
+ Second
+ Third
___

CheckedList
- [x] Write the press release
- [ ] Update the website
- [ ] Contact the media
___

  Code `code`
___

ABCDEFGHI Header
---
___

  Link [title google](https://www.google.com)
___

  Image ![alt text](c:\image.jpg)
___
  Image [alt text](c:\image.jpg)
___

| Syntax | Description |
| ------ | ----------- |
| Header | Title |
| Paragraph | Text |

___

~~~~ gherkin 
when(). 
then. 
given();
~~~~

___

``` json
{
"firstName": "John",
"lastName": "Smith",
"age": 25
}
```

___

``` java
package Intro;

public class _09_multiDimensArrayBasic {
    public static void main(String[] args) {

        String[][] cities = new String[2][2];
        cities[0][0] = "İstanbul";
        cities[0][1] = "Bursa";
        cities[1][0] = "Ankara";
        cities[1][1] = "Konya";
        cities[2][0] = "Diyarbakır";

        for(int i=0 ; i<2 ; i++ ){
            System.out.println("----------------");
            for (int j=0; j<3 ; j++){
                System.out.println(cities[i][j]);
            }
        }
    }
}
```

___

term
: definition

___









