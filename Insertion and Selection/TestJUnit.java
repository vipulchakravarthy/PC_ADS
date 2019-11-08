/**
 * This is JUnit that tests the lower method in StringHandling class.
 * This contains 80 testcases.
 *
 * Please don't run this file.
 * You can add your own test cases to this file by just copy and
 * paste the last three lines of the code (TestCase80).
 *
 * @author Deepak Kumar
 * @author Vipul
 */

import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;

public class TestJUnit {
    @Test
  public void testCase1() {
    int[] arr = {787, 879, 180, 316, 904, 612, 778, 936, 422, 859};
    int[] res = {180, 316, 422, 612, 778, 787, 859, 879, 904, 936};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortInsertion(arr));
  }
  @Test
  public void testCase2() {
    int[] arr = {2, 605, 128, 1, 176, 307, 671, 439, 131, 441, 690, 878, 381, 802, 816, 887, 165, 66, 198, 593, 546, 105, 451, 669, 861, 946, 488};
    int[] res = {1, 2, 66, 105, 128, 131, 165, 176, 198, 307, 381, 439, 441, 451, 488, 546, 593, 605, 669, 671, 690, 802, 816, 861, 878, 887, 946};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortInsertion(arr));
  }
  @Test
  public void testCase3() {
    int[] arr = {197, 17, 697, 379, 879, 677, 770, 23, 743, 535, 55, 441, 520, 170, 524, 535, 509, 619, 778, 146, 920, 918, 957};
    int[] res = {17, 23, 55, 146, 170, 197, 379, 441, 509, 520, 524, 535, 535, 619, 677, 697, 743, 770, 778, 879, 918, 920, 957};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortInsertion(arr));
  }
  @Test
  public void testCase4() {
    int[] arr = {};
    int[] res = {};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortInsertion(arr));
  }
  @Test
  public void testCase5() {
    int[] arr = {283, 641, 532, 804, 677, 833, 169, 425, 987, 909, 487, 592, 553, 892, 269, 529, 929, 638, 387, 3, 54, 695, 90, 296, 575};
    int[] res = {3, 54, 90, 169, 269, 283, 296, 387, 425, 487, 529, 532, 553, 575, 592, 638, 641, 677, 695, 804, 833, 892, 909, 929, 987};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortInsertion(arr));
  }
  @Test
  public void testCase6() {
    int[] arr = {619, 91, 466, 740, 845, 998, 919, 441, 246, 151, 546, 199, 623, 413, 842, 899, 465, 345, 749, 133, 342};
    int[] res = {91, 133, 151, 199, 246, 342, 345, 413, 441, 465, 466, 546, 619, 623, 740, 749, 842, 845, 899, 919, 998};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortInsertion(arr));
  }
  @Test
  public void testCase7() {
    int[] arr = {457, 31, 987, 632, 314, 636, 665, 58, 271, 933, 308, 159, 766, 181, 967, 655, 334};
    int[] res = {31, 58, 159, 181, 271, 308, 314, 334, 457, 632, 636, 655, 665, 766, 933, 967, 987};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortInsertion(arr));
  }
  @Test
  public void testCase8() {
    int[] arr = {329, 92, 283, 227, 88, 311, 289, 77, 81, 310, 206, 331, 999, 405, 588, 459, 251, 483, 549, 658, 966, 71, 441, 690, 328, 844, 979, 56, 258};
    int[] res = {56, 71, 77, 81, 88, 92, 206, 227, 251, 258, 283, 289, 310, 311, 328, 329, 331, 405, 441, 459, 483, 549, 588, 658, 690, 844, 966, 979, 999};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortInsertion(arr));
  }
  @Test
  public void testCase9() {
    int[] arr = {457, 387, 664, 132, 998, 706, 453, 15, 134, 74, 350};
    int[] res = {15, 74, 132, 134, 350, 387, 453, 457, 664, 706, 998};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortInsertion(arr));
  }
  @Test
  public void testCase10() {
    int[] arr = {846, 352, 796, 575};
    int[] res = {352, 575, 796, 846};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortInsertion(arr));
  }
  @Test
  public void testCase11() {
    int[] arr = {166, 190, 819, 956, 815, 431, 463, 195, 633, 51, 905, 475, 662, 50, 160, 447};
    int[] res = {50, 51, 160, 166, 190, 195, 431, 447, 463, 475, 633, 662, 815, 819, 905, 956};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortInsertion(arr));
  }
  @Test
  public void testCase12() {
    int[] arr = {3, 32, 65, 50, 812, 459, 584, 815, 877, 500, 429, 759, 623, 824, 262, 283, 719, 206, 437, 990, 497, 765, 175, 968, 603, 157, 708};
    int[] res = {3, 32, 50, 65, 157, 175, 206, 262, 283, 429, 437, 459, 497, 500, 584, 603, 623, 708, 719, 759, 765, 812, 815, 824, 877, 968, 990};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortInsertion(arr));
  }
  @Test
  public void testCase13() {
    int[] arr = {694, 933, 479, 557, 917, 221, 840, 773, 769, 752, 492, 487, 115};
    int[] res = {115, 221, 479, 487, 492, 557, 694, 752, 769, 773, 840, 917, 933};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortInsertion(arr));
  }
  @Test
  public void testCase14() {
    int[] arr = {638, 810, 352, 400, 882, 983, 940, 903, 789, 545, 612, 699, 333, 275, 70, 872, 765, 71, 924, 233, 73, 816, 941, 884, 919, 525, 974, 236, 465};
    int[] res = {70, 71, 73, 233, 236, 275, 333, 352, 400, 465, 525, 545, 612, 638, 699, 765, 789, 810, 816, 872, 882, 884, 903, 919, 924, 940, 941, 974, 983};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortInsertion(arr));
  }
  @Test
  public void testCase15() {
    int[] arr = {304, 100, 667, 984, 710, 371, 947, 522, 324, 709, 755, 397, 179, 404, 938, 73, 542};
    int[] res = {73, 100, 179, 304, 324, 371, 397, 404, 522, 542, 667, 709, 710, 755, 938, 947, 984};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortInsertion(arr));
  }
  @Test
  public void testCase16() {
    int[] arr = {736, 628, 944, 914, 500, 72, 590, 503, 602, 593, 169, 705, 971, 264, 380, 103, 101, 452, 843};
    int[] res = {72, 101, 103, 169, 264, 380, 452, 500, 503, 590, 593, 602, 628, 705, 736, 843, 914, 944, 971};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortInsertion(arr));
  }
  @Test
  public void testCase17() {
    int[] arr = {411, 35, 549, 143, 822, 583};
    int[] res = {35, 143, 411, 549, 583, 822};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortInsertion(arr));
  }
  @Test
  public void testCase18() {
    int[] arr = {657, 379, 703, 669, 208, 207, 612, 723, 795, 21, 788, 135, 529, 227, 222, 230, 805, 110, 435, 675, 416};
    int[] res = {21, 110, 135, 207, 208, 222, 227, 230, 379, 416, 435, 529, 612, 657, 669, 675, 703, 723, 788, 795, 805};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortInsertion(arr));
  }
  @Test
  public void testCase19() {
    int[] arr = {38, 56, 398};
    int[] res = {38, 56, 398};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortInsertion(arr));
  }
  @Test
  public void testCase20() {
    int[] arr = {722, 757, 839, 875, 472, 99, 338, 574, 209, 896, 623, 275, 349, 661, 838, 647, 394, 476, 12, 19, 672, 416, 90, 8};
    int[] res = {8, 12, 19, 90, 99, 209, 275, 338, 349, 394, 416, 472, 476, 574, 623, 647, 661, 672, 722, 757, 838, 839, 875, 896};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortInsertion(arr));
  }
  @Test
  public void testCase21() {
    int[] arr = {904, 232, 663, 557, 501, 159, 766, 561, 624, 124, 393, 3, 410, 16, 484, 904, 39, 103, 44, 695, 583, 365, 412, 618, 768, 813, 268, 367, 912};
    int[] res = {3, 16, 39, 44, 103, 124, 159, 232, 268, 365, 367, 393, 410, 412, 484, 501, 557, 561, 583, 618, 624, 663, 695, 766, 768, 813, 904, 904, 912};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortInsertion(arr));
  }
  @Test
  public void testCase22() {
    int[] arr = {979, 161, 954, 326, 386, 379, 503, 83, 965, 138, 981, 405, 168, 134, 736, 656, 362, 228, 390};
    int[] res = {83, 134, 138, 161, 168, 228, 326, 362, 379, 386, 390, 405, 503, 656, 736, 954, 965, 979, 981};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortInsertion(arr));
  }
  @Test
  public void testCase23() {
    int[] arr = {992, 638, 31, 212, 646, 260, 715, 13, 539, 984, 411, 425, 602, 899, 610, 856};
    int[] res = {13, 31, 212, 260, 411, 425, 539, 602, 610, 638, 646, 715, 856, 899, 984, 992};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortInsertion(arr));
  }
  @Test
  public void testCase24() {
    int[] arr = {879, 338};
    int[] res = {338, 879};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortInsertion(arr));
  }
  @Test
  public void testCase25() {
    int[] arr = {82, 66, 214, 267, 904, 335, 16, 186, 532, 976, 887, 20, 851, 137, 489, 250, 883, 301, 95, 814, 437, 995, 228, 797};
    int[] res = {16, 20, 66, 82, 95, 137, 186, 214, 228, 250, 267, 301, 335, 437, 489, 532, 797, 814, 851, 883, 887, 904, 976, 995};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortInsertion(arr));
  }
  @Test
  public void testCase26() {
    int[] arr = {655, 56, 775, 5, 241, 237, 343, 900, 650, 496, 533, 486, 939, 922, 694, 510, 831, 624, 773, 429, 268, 882};
    int[] res = {5, 56, 237, 241, 268, 343, 429, 486, 496, 510, 533, 624, 650, 655, 694, 773, 775, 831, 882, 900, 922, 939};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortInsertion(arr));
  }
  @Test
  public void testCase27() {
    int[] arr = {597, 45, 809, 782, 805, 301, 478, 332, 612, 973, 265, 189};
    int[] res = {45, 189, 265, 301, 332, 478, 597, 612, 782, 805, 809, 973};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortInsertion(arr));
  }
  @Test
  public void testCase28() {
    int[] arr = {765, 666, 971, 187, 925, 803, 320, 307, 67, 224, 118, 540, 504, 367, 143, 647, 103, 384, 854, 53};
    int[] res = {53, 67, 103, 118, 143, 187, 224, 307, 320, 367, 384, 504, 540, 647, 666, 765, 803, 854, 925, 971};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortInsertion(arr));
  }
  @Test
  public void testCase29() {
    int[] arr = {448, 958, 804, 598, 618, 638, 282, 932, 515, 890, 895, 344, 190, 119, 615, 509, 326, 400, 283, 606, 544, 114, 706, 113, 530, 534, 808, 108, 893};
    int[] res = {108, 113, 114, 119, 190, 282, 283, 326, 344, 400, 448, 509, 515, 530, 534, 544, 598, 606, 615, 618, 638, 706, 804, 808, 890, 893, 895, 932, 958};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortInsertion(arr));
  }
  @Test
  public void testCase30() {
    int[] arr = {324, 720};
    int[] res = {324, 720};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortInsertion(arr));
  }
  @Test
  public void testCase31() {
    int[] arr = {692};
    int[] res = {692};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortInsertion(arr));
  }
  @Test
  public void testCase32() {
    int[] arr = {194, 753, 375, 655, 890, 339, 413, 891, 582, 628, 340, 694, 729};
    int[] res = {194, 339, 340, 375, 413, 582, 628, 655, 694, 729, 753, 890, 891};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortInsertion(arr));
  }
  @Test
  public void testCase33() {
    int[] arr = {529, 507, 93, 39, 356, 895, 178, 512, 770, 979, 575, 536, 125, 20, 618, 212, 403, 318, 898, 4, 847, 797};
    int[] res = {4, 20, 39, 93, 125, 178, 212, 318, 356, 403, 507, 512, 529, 536, 575, 618, 770, 797, 847, 895, 898, 979};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortInsertion(arr));
  }
  @Test
  public void testCase34() {
    int[] arr = {7, 118, 807, 879, 807, 778, 723, 967, 295, 671};
    int[] res = {7, 118, 295, 671, 723, 778, 807, 807, 879, 967};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortInsertion(arr));
  }
  @Test
  public void testCase35() {
    int[] arr = {812, 295, 170, 60, 70, 772, 157, 154, 102, 161, 420, 525, 797, 285, 55, 226, 376, 242};
    int[] res = {55, 60, 70, 102, 154, 157, 161, 170, 226, 242, 285, 295, 376, 420, 525, 772, 797, 812};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortInsertion(arr));
  }
  @Test
  public void testCase36() {
    int[] arr = {17, 362, 573, 283, 924, 498, 464, 930, 762, 988, 621, 902, 350, 234, 205, 2, 405, 687, 912, 182, 940, 74, 822, 329, 118};
    int[] res = {2, 17, 74, 118, 182, 205, 234, 283, 329, 350, 362, 405, 464, 498, 573, 621, 687, 762, 822, 902, 912, 924, 930, 940, 988};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortInsertion(arr));
  }
  @Test
  public void testCase37() {
    int[] arr = {274};
    int[] res = {274};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortInsertion(arr));
  }
  @Test
  public void testCase38() {
    int[] arr = {977, 346, 671, 92, 919, 462, 456, 810, 157, 145, 965, 21, 953, 179, 265, 139, 641, 309, 919, 907, 244, 458, 486, 272, 943, 554, 269};
    int[] res = {21, 92, 139, 145, 157, 179, 244, 265, 269, 272, 309, 346, 456, 458, 462, 486, 554, 641, 671, 810, 907, 919, 919, 943, 953, 965, 977};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortInsertion(arr));
  }
  @Test
  public void testCase39() {
    int[] arr = {673, 351, 655, 50, 60, 974, 380, 0, 836, 994, 504, 205, 608, 541, 841, 708, 553, 231, 591, 801, 319, 404, 633, 505, 537};
    int[] res = {0, 50, 60, 205, 231, 319, 351, 380, 404, 504, 505, 537, 541, 553, 591, 608, 633, 655, 673, 708, 801, 836, 841, 974, 994};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortInsertion(arr));
  }
  @Test
  public void testCase40() {
    int[] arr = {108, 741, 978, 228};
    int[] res = {108, 228, 741, 978};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortInsertion(arr));
  }
  @Test
  public void testCase41() {
    int[] arr = {772, 707, 712, 614, 966, 999, 70};
    int[] res = {70, 614, 707, 712, 772, 966, 999};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortSelection(arr));
  }
  @Test
  public void testCase42() {
    int[] arr = {46, 82, 648, 786, 795, 516, 24, 364, 364, 752, 898, 809, 201, 615, 809, 884, 257, 22};
    int[] res = {22, 24, 46, 82, 201, 257, 364, 364, 516, 615, 648, 752, 786, 795, 809, 809, 884, 898};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortSelection(arr));
  }
  @Test
  public void testCase43() {
    int[] arr = {287, 399, 591, 67, 740, 853, 407, 76, 658, 295, 282, 639, 106, 712, 343, 702, 544, 409, 992, 405, 916, 542, 163, 950, 242};
    int[] res = {67, 76, 106, 163, 242, 282, 287, 295, 343, 399, 405, 407, 409, 542, 544, 591, 639, 658, 702, 712, 740, 853, 916, 950, 992};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortSelection(arr));
  }
  @Test
  public void testCase44() {
    int[] arr = {775, 927, 978, 665, 251, 536, 304, 201, 966, 944, 979, 766, 535, 70, 624, 652, 236, 822, 925, 734, 714, 770, 695, 323, 935, 865};
    int[] res = {70, 201, 236, 251, 304, 323, 535, 536, 624, 652, 665, 695, 714, 734, 766, 770, 775, 822, 865, 925, 927, 935, 944, 966, 978, 979};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortSelection(arr));
  }
  @Test
  public void testCase45() {
    int[] arr = {769, 919, 643, 629, 677, 665, 503, 452, 917, 983, 116, 400, 853, 803, 676, 323, 715, 524, 410};
    int[] res = {116, 323, 400, 410, 452, 503, 524, 629, 643, 665, 676, 677, 715, 769, 803, 853, 917, 919, 983};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortSelection(arr));
  }
  @Test
  public void testCase46() {
    int[] arr = {884, 513, 722, 172, 643, 16, 184, 405, 803, 699, 3, 545, 84, 159, 334};
    int[] res = {3, 16, 84, 159, 172, 184, 334, 405, 513, 545, 643, 699, 722, 803, 884};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortSelection(arr));
  }
  @Test
  public void testCase47() {
    int[] arr = {448, 11, 285, 732, 753, 47, 709, 193, 616, 879, 31, 847, 948, 106, 126, 489, 142, 23, 213, 121, 197, 84, 329, 596};
    int[] res = {11, 23, 31, 47, 84, 106, 121, 126, 142, 193, 197, 213, 285, 329, 448, 489, 596, 616, 709, 732, 753, 847, 879, 948};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortSelection(arr));
  }
  @Test
  public void testCase48() {
    int[] arr = {468, 940, 198, 450, 524, 765, 197, 793, 754, 621, 341};
    int[] res = {197, 198, 341, 450, 468, 524, 621, 754, 765, 793, 940};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortSelection(arr));
  }
  @Test
  public void testCase49() {
    int[] arr = {73, 625, 864, 156, 521, 192, 794, 571, 295, 156, 809, 660, 110, 31, 721, 708, 404};
    int[] res = {31, 73, 110, 156, 156, 192, 295, 404, 521, 571, 625, 660, 708, 721, 794, 809, 864};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortSelection(arr));
  }
  @Test
  public void testCase50() {
    int[] arr = {646, 787, 35, 727, 812, 148, 550, 546, 6, 220, 420, 432, 480, 266, 626, 803, 38, 469, 635, 215, 453, 630};
    int[] res = {6, 35, 38, 148, 215, 220, 266, 420, 432, 453, 469, 480, 546, 550, 626, 630, 635, 646, 727, 787, 803, 812};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortSelection(arr));
  }
  @Test
  public void testCase51() {
    int[] arr = {848};
    int[] res = {848};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortSelection(arr));
  }
  @Test
  public void testCase52() {
    int[] arr = {22, 454, 857, 814, 542, 125, 190, 865, 926, 697, 365, 125, 718, 843, 82, 394, 953, 197, 734, 706, 462};
    int[] res = {22, 82, 125, 125, 190, 197, 365, 394, 454, 462, 542, 697, 706, 718, 734, 814, 843, 857, 865, 926, 953};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortSelection(arr));
  }
  @Test
  public void testCase53() {
    int[] arr = {220, 796, 976, 620, 306, 324, 412};
    int[] res = {220, 306, 324, 412, 620, 796, 976};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortSelection(arr));
  }
  @Test
  public void testCase54() {
    int[] arr = {26, 178, 878, 208, 517, 480, 15, 186, 627, 996, 582, 934, 783, 46, 51, 950, 692, 623, 818, 739, 727, 985, 826, 556, 64, 316, 192, 837};
    int[] res = {15, 26, 46, 51, 64, 178, 186, 192, 208, 316, 480, 517, 556, 582, 623, 627, 692, 727, 739, 783, 818, 826, 837, 878, 934, 950, 985, 996};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortSelection(arr));
  }
  @Test
  public void testCase55() {
    int[] arr = {385, 715, 349, 78, 2, 664, 204, 448, 469, 225, 49, 182, 920, 23, 349, 742, 34, 271, 818, 191, 188};
    int[] res = {2, 23, 34, 49, 78, 182, 188, 191, 204, 225, 271, 349, 349, 385, 448, 469, 664, 715, 742, 818, 920};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortSelection(arr));
  }
  @Test
  public void testCase56() {
    int[] arr = {512, 569};
    int[] res = {512, 569};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortSelection(arr));
  }
  @Test
  public void testCase57() {
    int[] arr = {297, 470, 722, 861, 972, 453, 134, 557, 486};
    int[] res = {134, 297, 453, 470, 486, 557, 722, 861, 972};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortSelection(arr));
  }
  @Test
  public void testCase58() {
    int[] arr = {113, 791, 229, 706, 993, 64, 331, 193, 488, 74, 218, 860, 846, 829, 341, 373, 565, 968, 335};
    int[] res = {64, 74, 113, 193, 218, 229, 331, 335, 341, 373, 488, 565, 706, 791, 829, 846, 860, 968, 993};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortSelection(arr));
  }
  @Test
  public void testCase59() {
    int[] arr = {995, 92, 384};
    int[] res = {92, 384, 995};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortSelection(arr));
  }
  @Test
  public void testCase60() {
    int[] arr = {873, 913, 472, 891, 376, 385, 822, 128, 593};
    int[] res = {128, 376, 385, 472, 593, 822, 873, 891, 913};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortSelection(arr));
  }
  @Test
  public void testCase61() {
    int[] arr = {839, 168, 758, 779, 479, 180, 964, 774};
    int[] res = {168, 180, 479, 758, 774, 779, 839, 964};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortSelection(arr));
  }
  @Test
  public void testCase62() {
    int[] arr = {81, 594, 838, 125, 799, 789, 434, 653, 371, 652};
    int[] res = {81, 125, 371, 434, 594, 652, 653, 789, 799, 838};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortSelection(arr));
  }
  @Test
  public void testCase63() {
    int[] arr = {346, 640, 885, 442, 571, 398, 928, 205, 829, 854, 128, 740, 223, 557, 288, 623};
    int[] res = {128, 205, 223, 288, 346, 398, 442, 557, 571, 623, 640, 740, 829, 854, 885, 928};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortSelection(arr));
  }
  @Test
  public void testCase64() {
    int[] arr = {608, 849, 11, 298, 125, 983, 600, 530, 212, 913, 342, 189, 851, 457, 961, 193, 447, 127, 593, 576, 647, 481, 850, 720, 916, 613, 317};
    int[] res = {11, 125, 127, 189, 193, 212, 298, 317, 342, 447, 457, 481, 530, 576, 593, 600, 608, 613, 647, 720, 849, 850, 851, 913, 916, 961, 983};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortSelection(arr));
  }
  @Test
  public void testCase65() {
    int[] arr = {284, 303, 585, 841, 147, 586, 793, 634};
    int[] res = {147, 284, 303, 585, 586, 634, 793, 841};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortSelection(arr));
  }
  @Test
  public void testCase66() {
    int[] arr = {479, 277, 749, 983, 434, 585, 519, 255, 655, 887, 625, 313, 594, 114, 166, 964, 677, 509, 672};
    int[] res = {114, 166, 255, 277, 313, 434, 479, 509, 519, 585, 594, 625, 655, 672, 677, 749, 887, 964, 983};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortSelection(arr));
  }
  @Test
  public void testCase67() {
    int[] arr = {499, 241, 1, 877, 346, 866, 681, 132, 192, 577, 340, 848, 76, 701, 382, 2, 296, 902, 231, 114, 85, 454, 797, 266, 611, 217};
    int[] res = {1, 2, 76, 85, 114, 132, 192, 217, 231, 241, 266, 296, 340, 346, 382, 454, 499, 577, 611, 681, 701, 797, 848, 866, 877, 902};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortSelection(arr));
  }
  @Test
  public void testCase68() {
    int[] arr = {699, 223, 7, 538, 30, 571, 950, 406, 996, 754, 214, 424, 451, 509, 69, 733, 436, 12, 395, 434, 949, 300, 34, 711, 739, 276, 22, 747, 460};
    int[] res = {7, 12, 22, 30, 34, 69, 214, 223, 276, 300, 395, 406, 424, 434, 436, 451, 460, 509, 538, 571, 699, 711, 733, 739, 747, 754, 949, 950, 996};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortSelection(arr));
  }
  @Test
  public void testCase69() {
    int[] arr = {427, 666, 885, 42, 771, 342, 276, 372, 595, 798, 469, 163, 422, 860, 452, 131, 299, 729};
    int[] res = {42, 131, 163, 276, 299, 342, 372, 422, 427, 452, 469, 595, 666, 729, 771, 798, 860, 885};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortSelection(arr));
  }
  @Test
  public void testCase70() {
    int[] arr = {821, 191, 408, 528, 379, 527, 371, 658, 819, 835, 657, 170, 146, 879, 24, 62, 702, 977};
    int[] res = {24, 62, 146, 170, 191, 371, 379, 408, 527, 528, 657, 658, 702, 819, 821, 835, 879, 977};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortSelection(arr));
  }
  @Test
  public void testCase71() {
    int[] arr = {279, 538, 865, 909, 410, 596, 595, 338, 871, 312, 545, 639, 295, 190, 428, 554, 832, 479, 802, 750, 594, 791, 189, 575, 321, 839, 802, 768};
    int[] res = {189, 190, 279, 295, 312, 321, 338, 410, 428, 479, 538, 545, 554, 575, 594, 595, 596, 639, 750, 768, 791, 802, 802, 832, 839, 865, 871, 909};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortSelection(arr));
  }
  @Test
  public void testCase72() {
    int[] arr = {384, 304, 385, 64, 102, 263, 638, 310, 791, 430};
    int[] res = {64, 102, 263, 304, 310, 384, 385, 430, 638, 791};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortSelection(arr));
  }
  @Test
  public void testCase73() {
    int[] arr = {426, 11, 302, 542, 634, 931, 886, 203, 350, 54, 381, 337};
    int[] res = {11, 54, 203, 302, 337, 350, 381, 426, 542, 634, 886, 931};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortSelection(arr));
  }
  @Test
  public void testCase74() {
    int[] arr = {768, 12, 918, 750, 521, 156};
    int[] res = {12, 156, 521, 750, 768, 918};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortSelection(arr));
  }
  @Test
  public void testCase75() {
    int[] arr = {618, 439, 419, 285, 771, 321, 961, 552, 651, 526, 778, 51, 586, 231, 973, 271, 602, 979, 724, 740, 274};
    int[] res = {51, 231, 271, 274, 285, 321, 419, 439, 526, 552, 586, 602, 618, 651, 724, 740, 771, 778, 961, 973, 979};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortSelection(arr));
  }
  @Test
  public void testCase76() {
    int[] arr = {365, 108, 53, 670, 136, 112, 792, 115, 61, 771, 123, 128, 337, 596, 432, 974, 855, 562, 941, 125, 957};
    int[] res = {53, 61, 108, 112, 115, 123, 125, 128, 136, 337, 365, 432, 562, 596, 670, 771, 792, 855, 941, 957, 974};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortSelection(arr));
  }
  @Test
  public void testCase77() {
    int[] arr = {50, 259, 962, 952, 180, 972, 245, 356, 806, 372, 211, 958, 949, 728, 38, 841, 553, 821, 270};
    int[] res = {38, 50, 180, 211, 245, 259, 270, 356, 372, 553, 728, 806, 821, 841, 949, 952, 958, 962, 972};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortSelection(arr));
  }
  @Test
  public void testCase78() {
    int[] arr = {369, 998, 66, 67, 289, 621, 626, 159, 198, 509};
    int[] res = {66, 67, 159, 198, 289, 369, 509, 621, 626, 998};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortSelection(arr));
  }
  @Test
  public void testCase79() {
    int[] arr = {672, 745, 257, 78, 528, 638, 406, 399, 557, 636, 168, 327, 891, 597, 886, 838, 134, 719, 593, 297, 271, 592, 40, 847, 580, 319};
    int[] res = {40, 78, 134, 168, 257, 271, 297, 319, 327, 399, 406, 528, 557, 580, 592, 593, 597, 636, 638, 672, 719, 745, 838, 847, 886, 891};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortSelection(arr));
  }
  @Test
  public void testCase80() {
    int[] arr = {912, 441, 105, 588, 284, 808};
    int[] res = {105, 284, 441, 588, 808, 912};
    Solution s = new Solution();
    Assert.assertArrayEquals( res, s.sortSelection(arr));
  }


}

