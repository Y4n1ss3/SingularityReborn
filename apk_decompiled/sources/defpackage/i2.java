package defpackage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.net.VpnService;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.MouseWheelScrollingLogic;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.Scrollable2DNode;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextFieldScrollerPosition;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuData;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider;
import androidx.compose.foundation.text.input.internal.InputMethodManagerImpl;
import androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest;
import androidx.compose.material.ripple.AndroidRippleIndicationInstance;
import androidx.compose.material.ripple.AndroidRippleNode;
import androidx.compose.material3.DatePickerColors;
import androidx.compose.material3.DefaultTwoRowsTopAppBarOverride;
import androidx.compose.material3.DrawerState;
import androidx.compose.material3.LabelKt;
import androidx.compose.material3.ModalWideNavigationRailState;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TwoRowsTopAppBarOverrideScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.SaveableStateRegistryWrapper;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.spatial.RectListKt;
import androidx.compose.ui.text.AnnotatedString;
import com.lumi.singularity.system.DnsBlockerService;
import com.lumi.singularity.ui.activities.AdbActivity;
import com.lumi.singularity.ui.activities.AdbRootActivity;
import com.lumi.singularity.ui.activities.ControllerInfoActivity;
import com.lumi.singularity.ui.activities.DomainBlockerActivity;
import com.lumi.singularity.ui.activities.MainActivity;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class i2 implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ i2(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        w01 onInvalidateRipple$lambda$0;
        w01 addRipple_12SF9DM$lambda$0$0$0;
        TextContextMenuData data;
        AnnotatedString LayoutWithLinksAndInlineContent_11Od_4g$lambda$2$0;
        TextFieldScrollerPosition CoreTextField$lambda$4$0;
        TextLayoutResultProxy layoutResult;
        TextFieldColors textFieldColors;
        w01 OpenContextMenu$lambda$1$0;
        float TwoRowsTopAppBar$lambda$5$lambda$4;
        SharedPreferences sharedPrefs_delegate$lambda$0;
        float anchoredDraggableState$lambda$3;
        InputMethodManager imm_delegate$lambda$0;
        LayoutCoordinates Label$lambda$4$lambda$3;
        BaseInputConnection baseInputConnection_delegate$lambda$0;
        AnimationSpec animationSpec;
        MouseWheelScrollingLogic.MouseWheelScrollDelta sumOrNull$lambda$0;
        Object _init_$lambda$0;
        boolean isAttached;
        int i = this.d;
        int i2 = 0;
        w01 w01Var = w01.a;
        Object obj = this.e;
        switch (i) {
            case 0:
                int i3 = AdbActivity.w;
                ((AdbActivity) obj).finish();
                return w01Var;
            case 1:
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.parse("package:com.android.settings"));
                intent.setPackage("com.android.settings");
                intent.addFlags(402653184);
                ((AdbRootActivity) ((c3) obj)).startActivity(intent);
                return w01Var;
            case 2:
                onInvalidateRipple$lambda$0 = AndroidRippleIndicationInstance.onInvalidateRipple$lambda$0((AndroidRippleIndicationInstance) obj);
                return onInvalidateRipple$lambda$0;
            case 3:
                addRipple_12SF9DM$lambda$0$0$0 = AndroidRippleNode.addRipple_12SF9DM$lambda$0$0$0((AndroidRippleNode) obj);
                return addRipple_12SF9DM$lambda$0$0$0;
            case 4:
                data = ((TextContextMenuDataProvider) obj).data();
                return data;
            case 5:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default((String) obj, null, 2, null);
            case 6:
                return cq.z((Object[]) obj);
            case 7:
                LayoutWithLinksAndInlineContent_11Od_4g$lambda$2$0 = BasicTextKt.LayoutWithLinksAndInlineContent_11Od_4g$lambda$2$0((AnnotatedString) obj);
                return LayoutWithLinksAndInlineContent_11Od_4g$lambda$2$0;
            case 8:
                int i4 = ControllerInfoActivity.v;
                ((ControllerInfoActivity) obj).finish();
                return w01Var;
            case 9:
                CoreTextField$lambda$4$0 = CoreTextFieldKt.CoreTextField$lambda$4$0((Orientation) obj);
                return CoreTextField$lambda$4$0;
            case 10:
                layoutResult = ((LegacyTextFieldState) obj).getLayoutResult();
                return layoutResult;
            case 11:
                textFieldColors = ((DatePickerColors) obj).dateTextFieldColors;
                return textFieldColors;
            case Matrix.TranslateX /* 12 */:
                OpenContextMenu$lambda$1$0 = DefaultTextContextMenuDropdownProvider_androidKt.OpenContextMenu$lambda$1$0((TextContextMenuSession) obj);
                return OpenContextMenu$lambda$1$0;
            case Matrix.TranslateY /* 13 */:
                TwoRowsTopAppBar$lambda$5$lambda$4 = DefaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar$lambda$5$lambda$4((TwoRowsTopAppBarOverrideScope) obj);
                return Float.valueOf(TwoRowsTopAppBar$lambda$5$lambda$4);
            case Matrix.TranslateZ /* 14 */:
                sharedPrefs_delegate$lambda$0 = DnsBlockerService.sharedPrefs_delegate$lambda$0((DnsBlockerService) obj);
                return sharedPrefs_delegate$lambda$0;
            case 15:
                int i5 = DomainBlockerActivity.v;
                ((DomainBlockerActivity) obj).finish();
                return w01Var;
            case 16:
                anchoredDraggableState$lambda$3 = DrawerState.anchoredDraggableState$lambda$3((DrawerState) obj);
                return Float.valueOf(anchoredDraggableState$lambda$3);
            case 17:
                imm_delegate$lambda$0 = InputMethodManagerImpl.imm_delegate$lambda$0((InputMethodManagerImpl) obj);
                return imm_delegate$lambda$0;
            case 18:
                Label$lambda$4$lambda$3 = LabelKt.Label$lambda$4$lambda$3((ji0) obj);
                return Label$lambda$4$lambda$3;
            case 19:
                baseInputConnection_delegate$lambda$0 = LegacyTextInputMethodRequest.baseInputConnection_delegate$lambda$0((LegacyTextInputMethodRequest) obj);
                return baseInputConnection_delegate$lambda$0;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                MainActivity mainActivity = (MainActivity) obj;
                Set set = MainActivity.w;
                Intent prepare = VpnService.prepare(mainActivity);
                if (prepare != null) {
                    mainActivity.v.J(prepare);
                } else {
                    Intent action = new Intent(mainActivity, (Class<?>) DnsBlockerService.class).setAction(DnsBlockerService.ACTION_START);
                    action.getClass();
                    mainActivity.startService(action);
                }
                return w01Var;
            case 21:
                ((t70) obj).e.invoke(Boolean.valueOf(!r5.c));
                return w01Var;
            case 22:
                ((fi0) obj).d = true;
                return w01Var;
            case 23:
                animationSpec = ((ModalWideNavigationRailState) obj).animationSpec;
                return animationSpec;
            case 24:
                sumOrNull$lambda$0 = MouseWheelScrollingLogic.sumOrNull$lambda$0((zg) obj);
                return sumOrNull$lambda$0;
            case RectListKt.BitOffsetForParentId /* 25 */:
                sf0 sf0Var = (sf0) obj;
                return new sl(q10.e("kotlinx.serialization.Polymorphic", rf0.m, new go0[0], new mb0(sf0Var, 5)), (ji) sf0Var.b);
            case 26:
                ClassLoader classLoader = ((ql) obj).a;
                Class<?> loadClass = classLoader.loadClass("androidx.window.extensions.WindowExtensionsProvider");
                loadClass.getClass();
                Method declaredMethod = loadClass.getDeclaredMethod("getWindowExtensions", null);
                Class<?> loadClass2 = classLoader.loadClass("androidx.window.extensions.WindowExtensions");
                loadClass2.getClass();
                declaredMethod.getClass();
                return Boolean.valueOf(declaredMethod.getReturnType().equals(loadClass2) && Modifier.isPublic(declaredMethod.getModifiers()));
            case 27:
                _init_$lambda$0 = SaveableStateRegistryWrapper._init_$lambda$0((SaveableStateRegistryWrapper) obj);
                return _init_$lambda$0;
            case 28:
                hl0 hl0Var = (hl0) obj;
                hl0Var.getLifecycle().a(new di0(hl0Var, i2));
                return w01Var;
            default:
                isAttached = ((Scrollable2DNode) obj).isAttached();
                return Boolean.valueOf(isAttached);
        }
    }
}
