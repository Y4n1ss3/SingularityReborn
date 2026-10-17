package defpackage;

import android.content.Context;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.compose.animation.core.AnimationKt;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.foundation.AndroidExternalSurface_androidKt;
import androidx.compose.foundation.gestures.AnchoredDraggableDefaults;
import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.text.BasicSecureTextFieldKt;
import androidx.compose.foundation.text.BasicSecureTextField_androidKt;
import androidx.compose.foundation.text.BasicSecureTextField_androidKt$DefaultContentResolverForSecureTextField$1$1;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.BadgeKt;
import androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt;
import androidx.compose.material3.internal.AccessibilityUtilKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.layout.RulerScope;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.spatial.RectListKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.TextLayoutResult;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class d1 implements ky {
    public final /* synthetic */ int d;

    public /* synthetic */ d1(int i) {
        this.d = i;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 ObserveState$lambda$6$lambda$5;
        w01 IncreaseHorizontalSemanticsBounds$lambda$2;
        w01 IncreaseVerticalSemanticsBounds$lambda$5;
        float PositionalThreshold$lambda$0;
        boolean AnchoredDraggableState$lambda$2;
        boolean AnchoredDraggableState$lambda$0;
        boolean AlwaysDrag$lambda$0;
        float GetOrNan$lambda$0;
        boolean _init_$lambda$0;
        boolean confirmValueChange$lambda$0;
        boolean _init_$lambda$1;
        boolean _init_$lambda$02;
        boolean Saver$lambda$2;
        boolean Saver$lambda$5;
        AnchoredDraggableState Saver$lambda$1;
        w01 AndroidExternalSurface_58FFMhA$lambda$1$0;
        TextureView AndroidEmbeddedExternalSurface_sv6N_fY$lambda$0$0;
        w01 AndroidEmbeddedExternalSurface_sv6N_fY$lambda$1$0;
        AnimationVector createAnimation$lambda$0;
        AnimationVector createAnimation$lambda$1;
        boolean substringWithoutParagraphStyles$lambda$0;
        w01 TopAppBarLayout_lyUyIHI$lambda$51$lambda$41$lambda$40;
        w01 TopAppBarLayout_lyUyIHI$lambda$51$lambda$46$lambda$45;
        w01 badgeBounds$lambda$7$lambda$5;
        w01 BasicSecureTextField_ltb6GB4$lambda$4$0;
        BasicSecureTextField_androidKt$DefaultContentResolverForSecureTextField$1$1 DefaultContentResolverForSecureTextField$lambda$0;
        w01 BasicTextField$lambda$16$0;
        switch (this.d) {
            case 0:
                ObserveState$lambda$6$lambda$5 = AccessibilityServiceStateProvider_androidKt.ObserveState$lambda$6$lambda$5((q40) obj);
                return ObserveState$lambda$6$lambda$5;
            case 1:
                IncreaseHorizontalSemanticsBounds$lambda$2 = AccessibilityUtilKt.IncreaseHorizontalSemanticsBounds$lambda$2((SemanticsPropertyReceiver) obj);
                return IncreaseHorizontalSemanticsBounds$lambda$2;
            case 2:
                IncreaseVerticalSemanticsBounds$lambda$5 = AccessibilityUtilKt.IncreaseVerticalSemanticsBounds$lambda$5((SemanticsPropertyReceiver) obj);
                return IncreaseVerticalSemanticsBounds$lambda$5;
            case 3:
                return w01.a;
            case 4:
                PositionalThreshold$lambda$0 = AnchoredDraggableDefaults.PositionalThreshold$lambda$0(((Float) obj).floatValue());
                return Float.valueOf(PositionalThreshold$lambda$0);
            case 5:
                AnchoredDraggableState$lambda$2 = AnchoredDraggableKt.AnchoredDraggableState$lambda$2(obj);
                return Boolean.valueOf(AnchoredDraggableState$lambda$2);
            case 6:
                AnchoredDraggableState$lambda$0 = AnchoredDraggableKt.AnchoredDraggableState$lambda$0(obj);
                return Boolean.valueOf(AnchoredDraggableState$lambda$0);
            case 7:
                AlwaysDrag$lambda$0 = AnchoredDraggableKt.AlwaysDrag$lambda$0((PointerType) obj);
                return Boolean.valueOf(AlwaysDrag$lambda$0);
            case 8:
                GetOrNan$lambda$0 = AnchoredDraggableKt.GetOrNan$lambda$0(((Integer) obj).intValue());
                return Float.valueOf(GetOrNan$lambda$0);
            case 9:
                _init_$lambda$0 = androidx.compose.material3.internal.AnchoredDraggableState._init_$lambda$0(obj);
                return Boolean.valueOf(_init_$lambda$0);
            case 10:
                confirmValueChange$lambda$0 = AnchoredDraggableState.confirmValueChange$lambda$0(obj);
                return Boolean.valueOf(confirmValueChange$lambda$0);
            case 11:
                _init_$lambda$1 = androidx.compose.material3.internal.AnchoredDraggableState._init_$lambda$1(obj);
                return Boolean.valueOf(_init_$lambda$1);
            case Matrix.TranslateX /* 12 */:
                _init_$lambda$02 = AnchoredDraggableState._init_$lambda$0(obj);
                return Boolean.valueOf(_init_$lambda$02);
            case Matrix.TranslateY /* 13 */:
                Saver$lambda$2 = AnchoredDraggableState.Companion.Saver$lambda$2(obj);
                return Boolean.valueOf(Saver$lambda$2);
            case Matrix.TranslateZ /* 14 */:
                Saver$lambda$5 = AnchoredDraggableState.Companion.Saver$lambda$5(obj);
                return Boolean.valueOf(Saver$lambda$5);
            case 15:
                Saver$lambda$1 = AnchoredDraggableState.Companion.Saver$lambda$1(obj);
                return Saver$lambda$1;
            case 16:
                AndroidExternalSurface_58FFMhA$lambda$1$0 = AndroidExternalSurface_androidKt.AndroidExternalSurface_58FFMhA$lambda$1$0((SurfaceView) obj);
                return AndroidExternalSurface_58FFMhA$lambda$1$0;
            case 17:
                AndroidEmbeddedExternalSurface_sv6N_fY$lambda$0$0 = AndroidExternalSurface_androidKt.AndroidEmbeddedExternalSurface_sv6N_fY$lambda$0$0((Context) obj);
                return AndroidEmbeddedExternalSurface_sv6N_fY$lambda$0$0;
            case 18:
                AndroidEmbeddedExternalSurface_sv6N_fY$lambda$1$0 = AndroidExternalSurface_androidKt.AndroidEmbeddedExternalSurface_sv6N_fY$lambda$1$0((TextureView) obj);
                return AndroidEmbeddedExternalSurface_sv6N_fY$lambda$1$0;
            case 19:
                createAnimation$lambda$0 = AnimationKt.createAnimation$lambda$0((AnimationVector) obj);
                return createAnimation$lambda$0;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                createAnimation$lambda$1 = AnimationKt.createAnimation$lambda$1((AnimationVector) obj);
                return createAnimation$lambda$1;
            case 21:
                substringWithoutParagraphStyles$lambda$0 = AnnotatedStringKt.substringWithoutParagraphStyles$lambda$0((AnnotatedString.Annotation) obj);
                return Boolean.valueOf(substringWithoutParagraphStyles$lambda$0);
            case 22:
                TopAppBarLayout_lyUyIHI$lambda$51$lambda$41$lambda$40 = AppBarKt.TopAppBarLayout_lyUyIHI$lambda$51$lambda$41$lambda$40((SemanticsPropertyReceiver) obj);
                return TopAppBarLayout_lyUyIHI$lambda$51$lambda$41$lambda$40;
            case 23:
                TopAppBarLayout_lyUyIHI$lambda$51$lambda$46$lambda$45 = AppBarKt.TopAppBarLayout_lyUyIHI$lambda$51$lambda$46$lambda$45((SemanticsPropertyReceiver) obj);
                return TopAppBarLayout_lyUyIHI$lambda$51$lambda$46$lambda$45;
            case 24:
                sa saVar = (sa) obj;
                saVar.getClass();
                return saVar.a.a;
            case RectListKt.BitOffsetForParentId /* 25 */:
                sa saVar2 = (sa) obj;
                saVar2.getClass();
                return saVar2.a.a;
            case 26:
                badgeBounds$lambda$7$lambda$5 = BadgeKt.badgeBounds$lambda$7$lambda$5((RulerScope) obj);
                return badgeBounds$lambda$7$lambda$5;
            case 27:
                BasicSecureTextField_ltb6GB4$lambda$4$0 = BasicSecureTextFieldKt.BasicSecureTextField_ltb6GB4$lambda$4$0((SemanticsPropertyReceiver) obj);
                return BasicSecureTextField_ltb6GB4$lambda$4$0;
            case 28:
                DefaultContentResolverForSecureTextField$lambda$0 = BasicSecureTextField_androidKt.DefaultContentResolverForSecureTextField$lambda$0((Context) obj);
                return DefaultContentResolverForSecureTextField$lambda$0;
            default:
                BasicTextField$lambda$16$0 = BasicTextFieldKt.BasicTextField$lambda$16$0((TextLayoutResult) obj);
                return BasicTextField$lambda$16$0;
        }
    }
}
