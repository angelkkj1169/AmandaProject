package com.amanda.project.DTO;

public class MenuTitleDTO {
   private String menuName;
   private String menuContent;
   private String menuKind;
   
   public MenuTitleDTO(String menuName, String menuContent, String menuKind) {
      this.menuName = menuName;
      this.menuContent = menuContent;
      this.menuKind = menuKind;
   }
   public MenuTitleDTO() {
      super();
   }
   public String getMenuName() {
      return menuName;
   }
   public void setMenuName(String menuName) {
      this.menuName = menuName;
   }
   public String getMenuContent() {
      return menuContent;
   }
   public void setMenuContent(String menuContent) {
      this.menuContent = menuContent;
   }
   public String getMenuKind() {
      return menuKind;
   }
   public void setMenuKind(String menuKind) {
      this.menuKind = menuKind;
   }
   
   
}