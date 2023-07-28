package p230601;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class MenuTestPlus {

	public static void main(String[] args) {
		Frame f = new Frame("Parent");
		f.setSize(300, 200);

		MenuBar mb = new MenuBar();
		
		// 파일 메뉴
		Menu mFile = new Menu("파일(F)");
		MenuItem miNew = new MenuItem("새로 만들기(N)");
		MenuItem miOpen = new MenuItem("새 창(W)");
		MenuItem m1 = new MenuItem("저장(S)");
		MenuItem m2 = new MenuItem("다른 이름으로 저장(A)");	
		Menu mOthers1 = new Menu("페이지설정(U)");
		MenuItem mOthers2 = new MenuItem("인쇄(P)");
		MenuItem miExit = new MenuItem("끝내기(X)");

		mFile.add(miNew);
		mFile.add(miOpen);
		mFile.add(mOthers1);
		mFile.add(mOthers2);
		mFile.add(m1);
		mFile.add(m2);
		mFile.addSeparator();
		mFile.add(miExit);
		
		
		// 편집 메뉴
		Menu mEdit = new Menu("편집(E)");
		MenuItem[] mEditarr = new MenuItem[12];
		String[] str = new String[] {"실행취소", "잘라내기", "복사", "붙여넣기", "삭제", "Bing으로 검색", "찾기", "다음 찾기", "이전 찾기", "바꾸기", "이동", "모두선택", "시간/날짜"};

		for(int i=0; i<mEditarr.length; i++) {
			mEditarr[i] = new MenuItem(str[i]);
		}			
		
		for(int i =0; i<mEditarr.length; i++) {
			mEdit.add(mEditarr[i]);
			if(i==4 || i==10) {
				mEdit.addSeparator();
			}
		}			
		
//		MenuItem miPrint = new MenuItem("Print...");
//		MenuItem miPreview = new MenuItem("Print Preview");
//		MenuItem miSetup = new MenuItem("Print Setup...");
//		mOthers1.add(miPrint);
//		mOthers1.add(miPreview);
//		mOthers1.add(miSetup);
		
		// 서식 메뉴
		Menu mView = new Menu("서식");
		MenuItem mView_1 = new MenuItem("자동줄바꿈");
		MenuItem mView_2 = new MenuItem("글꼴");
		
		mView.add(mView_1);
		mView.add(mView_2);
		
		// 보기 메뉴
		Menu mHelp = new Menu("보기");
		MenuItem mHelp_1 = new MenuItem("확대하기/축소하기");
		CheckboxMenuItem miStatusbar = new CheckboxMenuItem("상태표시줄");
		mHelp.add(mHelp_1);
		mHelp.add(miStatusbar);

		// 도움말 메뉴
		Menu mHelphelp = new Menu("도움말");
		MenuItem h_1 = new MenuItem("도움말 보기");
		MenuItem h_2 = new MenuItem("피드백 보내기");
		MenuItem h_3 = new MenuItem("메모장 정보");
		mHelphelp.add(h_1);
		mHelphelp.add(h_2);
		mHelphelp.addSeparator();
		mHelphelp.add(h_3);
		
		mb.add(mFile);
		mb.add(mEdit);
		mb.add(mView);	
		mb.setHelpMenu(mHelp);
		mb.add(mHelphelp);

		f.setMenuBar(mb);
		f.setVisible(true);

	}

}
