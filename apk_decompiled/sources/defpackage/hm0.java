package defpackage;

import android.app.ActivityManager;
import android.graphics.Shader;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.foundation.text.TextDelegate;
import androidx.compose.foundation.text.TextFieldDelegate;
import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuData;
import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode;
import androidx.compose.foundation.text.modifiers.TextStringSimpleNode;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.material3.SearchBarState;
import androidx.compose.material3.SearchBarValue;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SliderState;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.WideNavigationRailStateImpl;
import androidx.compose.material3.WideNavigationRailValue;
import androidx.compose.material3.internal.BackEventProgress;
import androidx.compose.material3.internal.PredictiveBackState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import com.lumi.singularity.system.DnsBlockerService;
import com.lumi.singularity.system.TweakService;
import com.lumi.singularity.ui.activities.TweaksActivity;
import java.math.BigInteger;
import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class hm0 implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ hm0(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        BackEventProgress value;
        SearchBarValue currentValue_delegate$lambda$0;
        w01 recalculateTotalDurationNanos$lambda$0;
        Shader shaderState$lambda$0;
        AnimationSpec animationSpec;
        w01 gestureEndAction$lambda$1;
        w01 sendNotifications$lambda$0;
        boolean applySemantics$lambda$3;
        TextContextMenuData derivedData_delegate$lambda$0;
        TextSelectionColors textSelectionColors;
        IntSize notifyFocusedRect$lambda$0;
        TextLayoutResult layoutWithNewMeasureInputs__hBUhpc$lambda$0$0;
        IntOffset textRange$lambda$0$2;
        boolean applySemantics$lambda$32;
        WideNavigationRailValue _currentVal$lambda$0;
        int i = this.d;
        boolean z = false;
        w01 w01Var = w01.a;
        Object obj = this.e;
        switch (i) {
            case 0:
                value = ((PredictiveBackState) obj).getValue();
                return value;
            case 1:
                currentValue_delegate$lambda$0 = SearchBarState.currentValue_delegate$lambda$0((SearchBarState) obj);
                return currentValue_delegate$lambda$0;
            case 2:
                recalculateTotalDurationNanos$lambda$0 = SeekableTransitionState.recalculateTotalDurationNanos$lambda$0((SeekableTransitionState) obj);
                return recalculateTotalDurationNanos$lambda$0;
            case 3:
                return obj;
            case 4:
                io0 io0Var = (io0) obj;
                return Integer.valueOf(p01.p(io0Var, io0Var.j));
            case 5:
                shaderState$lambda$0 = ShaderBrushSpan.shaderState$lambda$0((ShaderBrushSpan) obj);
                return shaderState$lambda$0;
            case 6:
                animationSpec = ((SheetState) obj).anchoredDraggableMotionSpec;
                return animationSpec;
            case 7:
                gestureEndAction$lambda$1 = SliderState.gestureEndAction$lambda$1((SliderState) obj);
                return gestureEndAction$lambda$1;
            case 8:
                sendNotifications$lambda$0 = SnapshotStateObserver.sendNotifications$lambda$0((SnapshotStateObserver) obj);
                return sendNotifications$lambda$0;
            case 9:
                ((SnapshotStateList) obj).clear();
                return w01Var;
            case 10:
                applySemantics$lambda$3 = TextAnnotatedStringNode.applySemantics$lambda$3((TextAnnotatedStringNode) obj);
                return Boolean.valueOf(applySemantics$lambda$3);
            case 11:
                derivedData_delegate$lambda$0 = TextContextMenuToolbarHandlerNode.derivedData_delegate$lambda$0((TextContextMenuToolbarHandlerNode) obj);
                return derivedData_delegate$lambda$0;
            case Matrix.TranslateX /* 12 */:
                textSelectionColors = ((TextFieldColors) obj).textSelectionColors;
                return textSelectionColors;
            case Matrix.TranslateY /* 13 */:
                notifyFocusedRect$lambda$0 = TextFieldDelegate.Companion.notifyFocusedRect$lambda$0((TextDelegate) obj);
                return notifyFocusedRect$lambda$0;
            case Matrix.TranslateZ /* 14 */:
                layoutWithNewMeasureInputs__hBUhpc$lambda$0$0 = TextLayoutState.layoutWithNewMeasureInputs__hBUhpc$lambda$0$0((TextLayoutState) obj);
                return layoutWithNewMeasureInputs__hBUhpc$lambda$0$0;
            case 15:
                textRange$lambda$0$2 = TextLinkScope.textRange$lambda$0$2((IntRect) obj);
                return textRange$lambda$0$2;
            case 16:
                applySemantics$lambda$32 = TextStringSimpleNode.applySemantics$lambda$3((TextStringSimpleNode) obj);
                return Boolean.valueOf(applySemantics$lambda$32);
            case 17:
                int i2 = TweakService.T;
                return ((TweakService) obj).getSharedPreferences("singularity_prefs", 0);
            case 18:
                int i3 = TweaksActivity.C;
                Object systemService = ((TweaksActivity) obj).getSystemService("activity");
                systemService.getClass();
                Iterator<ActivityManager.RunningServiceInfo> it = ((ActivityManager) systemService).getRunningServices(Integer.MAX_VALUE).iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (DnsBlockerService.class.getName().equals(it.next().service.getClassName())) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 19:
                ((rw0) obj).finish();
                return w01Var;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                j11 j11Var = (j11) obj;
                return BigInteger.valueOf(j11Var.d).shiftLeft(32).or(BigInteger.valueOf(j11Var.e)).shiftLeft(32).or(BigInteger.valueOf(j11Var.f));
            default:
                _currentVal$lambda$0 = WideNavigationRailStateImpl._currentVal$lambda$0((WideNavigationRailStateImpl) obj);
                return _currentVal$lambda$0;
        }
    }
}
