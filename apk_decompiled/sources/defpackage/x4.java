package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.gestures.MouseWheelScrollingLogic;
import androidx.compose.foundation.gestures.NestedScrollScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.PrefetchScheduler;
import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt;
import androidx.compose.foundation.text.input.internal.selection.TextToolbarState;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class x4 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ x4(SharedPreferences sharedPreferences, ky kyVar, MutableState mutableState, MutableState mutableState2) {
        this.d = 9;
        this.f = sharedPreferences;
        this.e = kyVar;
        this.g = mutableState;
        this.h = mutableState2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        AnchoredDraggableState Saver$lambda$1;
        DisposableEffectResult CoreTextField$lambda$22$0;
        DisposableEffectResult LazyLayout$lambda$1$2$0;
        w01 animateMouseWheelScroll$lambda$0;
        w01 contextMenuBuilder$lambda$0;
        w01 addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldItem$0;
        String str;
        int i = this.d;
        int i2 = 1;
        int i3 = 2;
        hm hmVar = null;
        w01 w01Var = w01.a;
        Object obj2 = this.h;
        Object obj3 = this.g;
        Object obj4 = this.e;
        Object obj5 = this.f;
        switch (i) {
            case 0:
                Saver$lambda$1 = AnchoredDraggableState.Companion.Saver$lambda$1((ky) obj4, (iy) obj3, (iy) obj2, (ky) obj5, obj);
                break;
            case 1:
                SharedPreferences sharedPreferences = (SharedPreferences) obj4;
                un unVar = (un) obj5;
                MutableState mutableState = (MutableState) obj3;
                MutableState mutableState2 = (MutableState) obj2;
                String str2 = (String) obj;
                String str3 = (str2 == null || ds0.n0(str2)) ? "com.oculus.store" : str2;
                mutableState.setValue(str2 == null ? "" : str2);
                sharedPreferences.edit().putString("start_app_on_boot", str2).apply();
                mutableState2.setValue(Boolean.FALSE);
                nq nqVar = nr.a;
                p01.t(unVar, hq.d, null, new d4(str3, hmVar, i2), 2);
                break;
            case 2:
                CoreTextField$lambda$22$0 = CoreTextFieldKt.CoreTextField$lambda$22$0((LegacyTextFieldState) obj4, (TextInputService) obj5, (TextFieldValue) obj3, (ImeOptions) obj2, (DisposableEffectScope) obj);
                break;
            case 3:
                SharedPreferences sharedPreferences2 = (SharedPreferences) obj4;
                un unVar2 = (un) obj5;
                Context context = (Context) obj3;
                MutableState mutableState3 = (MutableState) obj2;
                LazyListScope lazyListScope = (LazyListScope) obj;
                lazyListScope.getClass();
                List I0 = yi.I0(hs.a.keySet());
                lazyListScope.items(I0.size(), null, new xa(I0, 5), ComposableLambdaKt.composableLambdaInstance(802480018, true, new za(I0, sharedPreferences2, unVar2, context, mutableState3)));
                LazyListScope.item$default(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(-1368120429, true, new pm(sharedPreferences2, context, unVar2, mutableState3)), 3, null);
                break;
            case 4:
                LazyLayout$lambda$1$2$0 = LazyLayoutKt.LazyLayout$lambda$1$2$0((LazyLayoutPrefetchState) obj4, (LazyLayoutItemContentFactory) obj5, (SubcomposeLayoutState) obj3, (PrefetchScheduler) obj2, (DisposableEffectScope) obj);
                break;
            case 5:
                animateMouseWheelScroll$lambda$0 = MouseWheelScrollingLogic.animateMouseWheelScroll$lambda$0((gi0) obj5, (MouseWheelScrollingLogic) obj3, (NestedScrollScope) obj2, (ky) obj4, (AnimationScope) obj);
                break;
            case 6:
                contextMenuBuilder$lambda$0 = TextFieldSelectionStateKt.contextMenuBuilder$lambda$0((State) obj4, (ContextMenuState) obj5, (my) obj3, (TextFieldSelectionState) obj2, (ContextMenuScope) obj);
                break;
            case 7:
                addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldItem$0 = TextFieldSelectionState_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldItem$0((iy) obj3, (iy) obj2, (TextFieldSelectionState) obj4, (TextToolbarState) obj5, (TextContextMenuSession) obj);
                break;
            case 8:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                r6.f((MutableState) obj3, bool, (SharedPreferences) obj4, "charge_notif_enabled", booleanValue);
                nq nqVar2 = nr.a;
                p01.t((un) obj5, hq.d, null, new a80(booleanValue, (rw0) obj2, hmVar, i3), 2);
                break;
            default:
                ky kyVar = (ky) obj4;
                MutableState mutableState4 = (MutableState) obj2;
                Boolean bool2 = (Boolean) obj;
                boolean booleanValue2 = bool2.booleanValue();
                ((MutableState) obj3).setValue(bool2);
                SharedPreferences.Editor putBoolean = ((SharedPreferences) obj5).edit().putBoolean("fps_on_boot", booleanValue2);
                if (booleanValue2) {
                    putBoolean.putInt("fps_target", ((Number) mutableState4.getValue()).intValue());
                }
                putBoolean.apply();
                if (booleanValue2) {
                    str = ((Number) mutableState4.getValue()).intValue() + " Hz will be set on boot";
                } else {
                    str = "FPS on Boot Disabled";
                }
                kyVar.invoke(str);
                break;
        }
        return w01Var;
    }

    public /* synthetic */ x4(iy iyVar, ky kyVar, ky kyVar2, iy iyVar2) {
        this.d = 0;
        this.e = kyVar;
        this.g = iyVar;
        this.h = iyVar2;
        this.f = kyVar2;
    }

    public /* synthetic */ x4(gi0 gi0Var, MouseWheelScrollingLogic mouseWheelScrollingLogic, NestedScrollScope nestedScrollScope, ky kyVar) {
        this.d = 5;
        this.f = gi0Var;
        this.g = mouseWheelScrollingLogic;
        this.h = nestedScrollScope;
        this.e = kyVar;
    }

    public /* synthetic */ x4(iy iyVar, iy iyVar2, TextFieldSelectionState textFieldSelectionState, TextToolbarState textToolbarState) {
        this.d = 7;
        this.g = iyVar;
        this.h = iyVar2;
        this.e = textFieldSelectionState;
        this.f = textToolbarState;
    }

    public /* synthetic */ x4(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.h = obj4;
    }
}
