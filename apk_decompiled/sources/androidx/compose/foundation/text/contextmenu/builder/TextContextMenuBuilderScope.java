package androidx.compose.foundation.text.contextmenu.builder;

import androidx.compose.foundation.text.contextmenu.data.TextContextMenuComponent;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuData;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSeparator;
import defpackage.ky;
import defpackage.va0;
import defpackage.xa0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextContextMenuBuilderScope {
    public static final int $stable = 8;
    private final xa0 components = new xa0();
    private final xa0 filters = new xa0();

    public final void addComponent$foundation(TextContextMenuComponent textContextMenuComponent) {
        this.components.g(textContextMenuComponent);
    }

    public final void addFilter$foundation(ky kyVar) {
        this.filters.g(kyVar);
    }

    public final TextContextMenuData build$foundation() {
        xa0 xa0Var = new xa0();
        xa0 xa0Var2 = this.components;
        Object[] objArr = xa0Var2.a;
        int i = xa0Var2.b;
        boolean z = true;
        TextContextMenuComponent textContextMenuComponent = null;
        for (int i2 = 0; i2 < i; i2++) {
            TextContextMenuComponent textContextMenuComponent2 = (TextContextMenuComponent) objArr[i2];
            if (!z || textContextMenuComponent2 != TextContextMenuSeparator.INSTANCE) {
                if (!TextContextMenuBuilderScopeKt.isSeparator(textContextMenuComponent2) || !TextContextMenuBuilderScopeKt.isSeparator(textContextMenuComponent)) {
                    if (!TextContextMenuBuilderScopeKt.isSeparator(textContextMenuComponent2)) {
                        xa0 xa0Var3 = this.filters;
                        Object[] objArr2 = xa0Var3.a;
                        int i3 = xa0Var3.b;
                        for (int i4 = 0; i4 < i3; i4++) {
                            if (((Boolean) ((ky) objArr2[i4]).invoke(textContextMenuComponent2)).booleanValue()) {
                            }
                        }
                    }
                    xa0Var.g(textContextMenuComponent2);
                    z = false;
                    textContextMenuComponent = textContextMenuComponent2;
                }
                z = false;
                break;
            }
        }
        if (TextContextMenuBuilderScopeKt.isSeparator((TextContextMenuComponent) (xa0Var.d() ? null : xa0Var.a[xa0Var.b - 1]))) {
            xa0Var.l(xa0Var.b - 1);
        }
        va0 va0Var = xa0Var.c;
        if (va0Var == null) {
            va0Var = new va0(xa0Var);
            xa0Var.c = va0Var;
        }
        return new TextContextMenuData(va0Var);
    }

    public final void separator() {
        this.components.g(TextContextMenuSeparator.INSTANCE);
    }
}
