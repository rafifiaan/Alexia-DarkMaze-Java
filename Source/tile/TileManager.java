package tile;

import java.awt.Graphics2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.imageio.ImageIO;

import main.GamePanel;

public class TileManager {

	GamePanel gp;
	public Tile[] tile;
	public int mapTileNum[][];
	
	public TileManager(GamePanel gp){
		this.gp = gp;
		tile = new Tile[2600];
		mapTileNum = new int[gp.maxWorldCol][gp.maxWorldRow];
		getTileImage();
		loadMap();
	}
	
	public void getTileImage() {
		try {
			for(int i = 0; i < 2500; i++) {
				String path = "/TileNew/WorldGame_" + i + ".png";
				tile[i] = new Tile();
				tile[i].image = ImageIO.read(getClass().getResourceAsStream(path));
			}
			
			//tile collision
			//200
			for(int i = 257; i<= 293; i++) {
				tile[i].collision = true;
			}

			//300
			for(int i = 307; i<= 343; i++) {
				if(i == 307 || i == 311 || i == 312 || i == 316 || i == 331 || i == 334 || i == 343) {
					tile[i].collision = true;	
				}
			}
			for(int i = 357; i<= 393; i++) {
				if(i == 358 || i == 359 || i == 360 || i == 365 || i == 366 || i == 370 || i == 376 ||
				   i == 380 || i == 383 || i == 392) {
					continue;
				}
				tile[i].collision = true;	
			}
			
			//400
			for(int i = 407; i<= 443; i++) {
				if(i == 410 || i == 415 || i == 420 || i == 426 || i == 430 || i == 433 || i == 442 ) {
					continue;
				}
				tile[i].collision = true;	
			}
			
			for(int i = 457; i<= 493; i++) {
				if(i == 460 || i == 465 || i == 470 || i == 476 || i == 480 || i == 483 || i == 484 
					|| i == 492) {
					continue;
				}
				tile[i].collision = true;	
			}
	
			//500
			for(int i = 507; i<= 543; i++) {
				if(i == 507 || i == 508 || i == 509 || i == 511 || i == 512 || i == 519 || i == 521 ||
				   i == 525 || i == 527 || i == 543	) {
					tile[i].collision = true;	
				}	
			}
			
			for(int i = 557; i<= 593; i++) {
				if(i == 558 || i == 559 || i == 560 || i == 561 || i == 562 || i == 563 || i == 568 || 
				   i == 570 || i == 572 || i == 574 || i == 578 || i == 584 || i == 592) {
					continue;
				}
				tile[i].collision = true;	
			}
			
			//600
			for(int i = 607; i<= 643; i++) {
				if(i == 608 || i == 609 || i == 610 || i == 618 || i == 620 || i == 624 || i == 628 || 
				   i == 634 || i == 642) {
					continue;	
				}
				tile[i].collision = true;
			}
			
			for(int i = 657; i<= 693; i++) {
				if(i == 658 || i == 659 || i == 660 || i == 668 || i == 670 || i == 674 || i == 678 || 
				   i == 684 || i == 692) {
					continue;
				}
				tile[i].collision = true;	
			}
			
			//700
			for(int i = 707; i<= 743; i++) {
				if(i == 707 || i == 708 || i == 709 || i == 711 || i == 712 || i == 713 || i == 714 || 
				   i == 721 || i == 722 || i == 723 || i == 726 || i == 729 || i == 735) {
					tile[i].collision = true;
				}	
			}
			
			for(int i = 757; i<= 793; i++) {
				if(i == 760 || i == 762 || i == 763 || i == 765 || i == 770 || i == 771 || i == 772 || 
				   i == 773 || i == 774 || i == 780 || i == 784 || i == 786) {
					continue;
				}
				tile[i].collision = true;	
			}
			
			//800
			for(int i = 807; i<= 843; i++) {
				if(i == 812 || i == 823 || i == 830 || i == 834) {
					continue;
				}
				tile[i].collision = true;	
			}
			for(int i = 857; i<= 893; i++) {
				if(i == 858 || i == 862 || i == 873 || i == 880 || i == 884) {
					continue;
				}
				tile[i].collision = true;	
			}
			
			//900
			for(int i = 907; i<= 943; i++) {
				if(i == 907 || i == 909 || i == 910 || i == 911 || i == 913 || i == 914 || i == 915 || 
				   i == 919 || i == 920 || i == 921 || i == 922 || i == 924 || i == 935 || i == 936 || i == 937 || i == 943 ) {
					tile[i].collision = true;
				}	
			}
			for(int i = 957; i<= 993; i++) {
				if(i == 957 || i == 959 || i == 967 || i == 969 || i == 974 || i == 976 || i == 977 || 
				   i == 978 || i == 979 || i == 980 || i == 981 || i == 982 || i == 987 || i == 988 || i == 989 || i == 990 || i == 991 || i == 993) {
					tile[i].collision = true;
				}	
			}
			
			//1000
			for(int i = 1007; i<= 1043; i++) {
				if(i == 1008 || i == 1009 || i == 1010 || i == 1011 || i == 1013 || i == 1018 || i == 1020 || i == 1022 || 
				   i == 1025 || i == 1033 || i == 1042) {
					continue;
				}
				tile[i].collision = true;	
			}
			for(int i = 1057; i<= 1093; i++) {
				if(i == 1061 || i == 1063 || i == 1068 || i == 1069 || i == 1070 || i == 1072 || i == 1075 || i == 1083 || i == 1092) {
					continue;
				}
				tile[i].collision = true;	
			}
			
			//1100
			for(int i = 1107; i<= 1143; i++) {
				if(i == 1111 || i == 1113 || i == 1118 || i == 1120 || i == 1122 || i == 1125 || i == 1127 || i == 1128 || i == 1129 ||
				   i == 1130 || i == 1131 || i == 1133 || i == 1138 || i == 1139 || i == 1140 || i == 1142) {
					continue;
				}
				tile[i].collision = true;	
			}
			for(int i = 1157; i<= 1193; i++) {
				if(i == 1161 || i == 1163 || i == 1165 || i == 1166 || i == 1167 || i == 1168 || i == 1172 || i == 1173 || i == 1174 ||
				   i == 1175 || i == 1179 || i == 1183 || i == 1184 || i == 1185 || i == 1190 || i == 1192) {
					continue;
				}
				tile[i].collision = true;	
			}
			
			//1200
			for(int i = 1207; i<= 1243; i++) {
				if(i == 1208 || i == 1209 || i == 1222 || i == 1224 || i == 1225 || i == 1229 || i == 1233 || i == 1235 || 
						i == 1240 || i == 1242) {
					continue;
				}
				tile[i].collision = true;	
			}
			for(int i = 1257; i<= 1293; i++) {
				if(i == 1258 || i == 1272 || i == 1274 || i == 1275 || i == 1279 || i == 1283 || i == 1285 || 
						i == 1290 || i == 1292) {
					continue;
				}
				tile[i].collision = true;	
			}
			
			//1300
			for(int i = 1307; i<= 1343; i++) {
				if(i == 1307 || i == 1309 || i == 1310 || i == 1311 || i == 1312 || i == 1313 || i == 1314 || i == 1315 || i == 1316 || 
				   i == 1317 || i == 1318 || i == 1319 || i == 1323 || i == 1334 || i == 1343) {
					tile[i].collision = true;
				}	
			}
			for(int i = 1357; i<= 1393; i++) {
				if(i == 1358 || i == 1361 || i == 1362 || i == 1363 || i == 1365 || i == 1366 || i == 1367 || 
						i == 1368 || i == 1369 || i == 1370 || i == 1378 || i == 1383 || i == 1385) {
					continue;
				}
				tile[i].collision = true;	
			}
			
			//1400
			for(int i = 1407; i<= 1443; i++) {
				if(i == 1408 || i == 1411 || i == 1413 || i == 1418 || i == 1428 || i == 1433 || i == 1435) {
					continue;
				}
				tile[i].collision = true;	
			}
			for(int i = 1457; i<= 1493; i++) {
				if(i == 1458 || i == 1461 || i == 1463 || i == 1468 || i == 1478 || i == 1483 || i == 1485) {
					continue;
				}
				tile[i].collision = true;	
			}
			
			//1500
			for(int i = 1507; i<= 1543; i++) {
				if(i == 1507 || i == 1509 || i == 1510 || i == 1512 || i == 1514 || i == 1515 || i == 1516 || i == 1517 || i == 1519 || 
				   i == 1520 || i == 1521 || i == 1522 || i == 1525 || i == 1534 || i == 1538 || i == 1543) {
					tile[i].collision = true;
				}	
			}
			for(int i = 1557; i<= 1593; i++) {
				if(i == 1557 || i == 1562 || i == 1575 || i == 1577 || i == 1578 || i == 1579 || i == 1580 || i == 1586 || 
						i == 1588 || i == 1590 || i == 1591 || i == 1593) {
					tile[i].collision = true;
				}	
			}
			
			//1600
			for(int i = 1607; i<= 1643; i++) {
				if(i == 1616 || i == 1622 || i == 1626 || i == 1631 || i == 1637 || i == 1639 || i == 1642) {
					continue;
				}
				tile[i].collision = true;	
			}
			for(int i = 1657; i<= 1693; i++) {
				if(i == 1666 || i == 1672 || i == 1676 || i == 1681 || i == 1687 || i == 1689 || i == 1692) {
					continue;
				}
				tile[i].collision = true;	
			}
			
			//1700
			for(int i = 1707; i<= 1743; i++) {
				if(i == 1712 || i == 1716 || i == 1722 || i == 1726 || i == 1727 || i == 1728 || i == 1729 || i == 1731 || 
				   i == 1737 || i == 1738 || i == 1739 || i == 1741 || i == 1742) {
					continue;
				}
				tile[i].collision = true;	
			}
			for(int i = 1757; i<= 1793; i++) {
				if(i == 1758 || i == 1759 || i == 1760 || i == 1761 || i == 1762 || i == 1763 || i == 1764 || i == 1766 || i == 1768 || i == 1769 || 
				   i == 1770 || i == 1772 || i == 1773 || i == 1774 || i == 1775 || i == 1776 || i == 1781 || i == 1783 || i == 1785 || i == 1787) {
					continue;
				}
				tile[i].collision = true;	
			}
			
			//1800
			for(int i = 1807; i<= 1843; i++) {
				if(i == 1808 || i == 1814 || i == 1816 || i == 1818 || i == 1825 || i == 1831 || 
						i == 1833 || i == 1835 || i == 1837) {
					continue;
				}
				tile[i].collision = true;	
			}
			for(int i = 1857; i<= 1893; i++) {
				if(i == 1858 || i == 1864 || i == 1866 || i == 1868 || i == 1875 || i == 1881 || 
						i == 1883 || i == 1885 || i == 1887) {
					continue;
				}
				tile[i].collision = true;	
			}
			
			//1900
			for(int i = 1907; i<= 1943; i++) {
				if(i == 1907 || i == 1909 || i == 1910 || i == 1911 || i == 1912 || i == 1913 || i == 1915 || i == 1917 || i == 1919 || 
				   i == 1920 || i == 1921 || i == 1922 || i == 1923 || i == 1924 || i == 1926 || i == 1932 || i == 1934 || i == 1936 || i == 1943) {
					tile[i].collision = true;
				}	
			}
			for(int i = 1957; i<= 1993; i++) {
				if(i == 1957 || i == 1959 || i == 1965 || i == 1967 || i == 1971 || i == 1976 || i == 1978 || 
						i == 1982 || i == 1986 || i == 1989 || i == 1993) {
					tile[i].collision = true;
				}	
			}
			
			//2000
			for(int i = 2007; i<= 2043; i++) {
				if(i == 2007 || i == 2009 || i == 2010 || i == 2011 || i == 2012 || i == 2013 || i == 2014 || i == 2015 || i == 2017 || i == 2018 || 
				   i == 2019 || i == 2021 || i == 2023 || i == 2024 || i == 2028 || i == 2035 || i == 2036 || i == 2037 || i == 2038 || i == 2039 || i == 2043) {
					tile[i].collision = true;
				}	
			}
			for(int i = 2057; i<= 2093; i++) {
				if(i == 2058 || i == 2066 || i == 2070 || i == 2072 || i == 2077 || i == 2079 || 
						i == 2084 || i == 2090 || i == 2091 || i == 2092) {
					continue;
				}
				tile[i].collision = true;	
			}
			
			//2100
			for(int i = 2107; i<= 2143; i++) {
				if(i == 2108 || i == 2116 || i == 2120 || i == 2122 || i == 2127 || i == 2129 || 
						i == 2134 || i == 2140 || i == 2141 || i == 2142) {
					continue;
				}
				tile[i].collision = true;	
			}
			for(int i = 2157; i<= 2193; i++) {
				if(i == 2157 || i == 2167 || i == 2173 || i == 2174 || i == 2175 || i == 2176 || i == 2178 || i == 2180 || 
						i == 2181 || i == 2182 || i == 2183 || i == 2189 || i == 2193) {
					tile[i].collision = true;
				}	
			}
			
			//2200
			for(int i = 2207; i<= 2243; i++) {
				tile[i].collision = true;
			}
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public void loadMap() {
		try {
			InputStream is = getClass().getResourceAsStream("/maps/NewMaps.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			int col = 0;
			int row = 0;
			
			while(col < gp.maxWorldCol && row < gp.maxWorldRow) {
				String line = br.readLine();
				while (col < gp.maxWorldCol) {
					String numbers[] = line.split(" ");
					int num = Integer.parseInt(numbers[col]);
					mapTileNum[col][row] = num;
					col++;
				}
				if(col == gp.maxWorldCol) {
					col = 0;
					row++;
				}
			}
				br.close();
			}catch(Exception e){
		}
	}
	
	public void draw(Graphics2D g2) {
		int worldCol = 0;
		int worldRow = 0;
		
		while(worldCol < gp.maxWorldCol && worldRow < gp.maxWorldRow) {
			
			int tileNum = mapTileNum[worldCol][worldRow];
			int worldX = worldCol * gp.tilesize;
			int worldY = worldRow * gp.tilesize;
			int screenX = worldX - gp.player.worldX + gp.player.screenX;
			int screenY = worldY - gp.player.worldY + gp.player.screenY;
			
			if (worldX + gp.tilesize > gp.player.worldX - gp.player.screenX && 
					worldX - gp.tilesize < gp.player.worldX + gp.player.screenX && 
					worldY + gp.tilesize > gp.player.worldY - gp.player.screenY &&
					worldY - gp.tilesize < gp.player.worldY + gp.player.screenY) {
			
				g2.drawImage(tile[tileNum].image,screenX,screenY,gp.tilesize,gp.tilesize,null);
			}
			worldCol++;
			if(worldCol == gp.maxWorldCol) {
				worldCol = 0;
				worldRow++;
			}
		}
	}
}