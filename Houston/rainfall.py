

def get_list():

    list = raw_input("Enter number sepereated by COMMAS: \n")

    list = list.split(", ")

    return list


initial_list = get_list()


def turn_into_int_remove_negatives(list):

    new_list = []

    for i in range(0, len(list)):

        number = int(list[i])

        print(number)

        if number >= 0:
            new_list.append(number)

    print "hi" +  str(new_list)
    return new_list


def get_average(list):

    sum = 0

    if -999 in list:
        first_appearance = list.index(-999)

        for i in range(0,  first_appearance):
            sum += list[i]

        sum /= len(list[0:first_appearance])

    elif -999 not in list:
        for i in range(0,  len(list)):
            sum += list[i]

        sum /= len(list)

    print("Average: " + str(sum))
    return sum


int_list = turn_into_int_remove_negatives(initial_list)


(get_average(int_list))

