package defpackage;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider_androidKt;
import androidx.compose.foundation.text.contextmenu.internal.PlatformDefaultTextContextMenuProviders_androidKt;
import androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProviderKt;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SelectionContainerKt;
import androidx.compose.material3.DateInputKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class i3 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ MutableState e;

    public /* synthetic */ i3(MutableState mutableState, int i) {
        this.d = i;
        this.e = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 ProvidePlatformTextContextMenuToolbar$lambda$5$0$0;
        w01 ProvideBasicTextContextMenu$lambda$4$0$0;
        w01 LayoutWithLinksAndInlineContent_11Od_4g$lambda$4$0;
        w01 BasicText_CL7eQgs$lambda$5$0;
        w01 DateInputTextField_xJ3Ic0Y$lambda$14$lambda$13;
        w01 ProvideBothDefaultProviders$lambda$4$0$0;
        w01 SelectionContainer$lambda$3$0;
        int i = this.d;
        int i2 = 0;
        w01 w01Var = w01.a;
        MutableState mutableState = this.e;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                StringBuilder sb = new StringBuilder();
                int length = str.length();
                while (i2 < length) {
                    char charAt = str.charAt(i2);
                    if (Character.isDigit(charAt)) {
                        sb.append(charAt);
                    }
                    i2++;
                }
                mutableState.setValue(sb.toString());
                break;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                StringBuilder sb2 = new StringBuilder();
                int length2 = str2.length();
                while (i2 < length2) {
                    char charAt2 = str2.charAt(i2);
                    if (Character.isDigit(charAt2)) {
                        sb2.append(charAt2);
                    }
                    i2++;
                }
                mutableState.setValue(sb2.toString());
                break;
            case 2:
                String str3 = (String) obj;
                str3.getClass();
                StringBuilder sb3 = new StringBuilder();
                int length3 = str3.length();
                while (i2 < length3) {
                    char charAt3 = str3.charAt(i2);
                    if (Character.isDigit(charAt3)) {
                        sb3.append(charAt3);
                    }
                    i2++;
                }
                mutableState.setValue(sb3.toString());
                break;
            case 3:
                ProvidePlatformTextContextMenuToolbar$lambda$5$0$0 = AndroidTextContextMenuToolbarProvider_androidKt.ProvidePlatformTextContextMenuToolbar$lambda$5$0$0(mutableState, (LayoutCoordinates) obj);
                break;
            case 4:
                ProvideBasicTextContextMenu$lambda$4$0$0 = BasicTextContextMenuProviderKt.ProvideBasicTextContextMenu$lambda$4$0$0(mutableState, (LayoutCoordinates) obj);
                break;
            case 5:
                LayoutWithLinksAndInlineContent_11Od_4g$lambda$4$0 = BasicTextKt.LayoutWithLinksAndInlineContent_11Od_4g$lambda$4$0(mutableState, (List) obj);
                break;
            case 6:
                BasicText_CL7eQgs$lambda$5$0 = BasicTextKt.BasicText_CL7eQgs$lambda$5$0(mutableState, (TextAnnotatedStringNode.TextSubstitutionValue) obj);
                break;
            case 7:
                DateInputTextField_xJ3Ic0Y$lambda$14$lambda$13 = DateInputKt.DateInputTextField_xJ3Ic0Y$lambda$14$lambda$13(mutableState, (SemanticsPropertyReceiver) obj);
                break;
            case 8:
                String str4 = (String) obj;
                str4.getClass();
                mutableState.setValue(str4);
                break;
            case 9:
                Float f = (Float) obj;
                f.getClass();
                mutableState.setValue(f);
                break;
            case 10:
                Float f2 = (Float) obj;
                f2.getClass();
                mutableState.setValue(f2);
                break;
            case 11:
                Float f3 = (Float) obj;
                f3.getClass();
                mutableState.setValue(f3);
                break;
            case Matrix.TranslateX /* 12 */:
                t1 t1Var = (t1) obj;
                t1Var.getClass();
                if (t1Var.d == -1) {
                    mutableState.setValue(Boolean.TRUE);
                    break;
                }
                break;
            case Matrix.TranslateY /* 13 */:
                String str5 = (String) obj;
                str5.getClass();
                mutableState.setValue(((String) mutableState.getValue()) + str5 + "\n");
                break;
            case Matrix.TranslateZ /* 14 */:
                mutableState.setValue(((String) mutableState.getValue()) + ((String) obj) + "\n");
                break;
            case 15:
                mutableState.setValue(((String) mutableState.getValue()) + ((String) obj) + "\n");
                break;
            case 16:
                Float f4 = (Float) obj;
                f4.getClass();
                mutableState.setValue(f4);
                break;
            case 17:
                mutableState.setValue((String) obj);
                break;
            case 18:
                mutableState.setValue(((String) mutableState.getValue()) + ((String) obj) + "\n");
                break;
            case 19:
                ProvideBothDefaultProviders$lambda$4$0$0 = PlatformDefaultTextContextMenuProviders_androidKt.ProvideBothDefaultProviders$lambda$4$0$0(mutableState, (LayoutCoordinates) obj);
                break;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                SelectionContainer$lambda$3$0 = SelectionContainerKt.SelectionContainer$lambda$3$0(mutableState, (Selection) obj);
                break;
            case 21:
                String str6 = (String) obj;
                str6.getClass();
                mutableState.setValue(str6);
                break;
            case 22:
                mutableState.setValue((String) obj);
                break;
            default:
                mutableState.setValue((String) obj);
                break;
        }
        return w01Var;
    }
}
