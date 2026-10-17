package defpackage;

import android.view.View;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.draganddrop.CacheDrawScopeDragShadowCallback;
import androidx.compose.foundation.gestures.BringIntoViewSpec;
import androidx.compose.foundation.gestures.BringIntoViewSpec_androidKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.ClickableTextKt;
import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$8$1$1$2;
import androidx.compose.foundation.text.input.internal.ComposeInputMethodManager;
import androidx.compose.foundation.text.input.internal.ComposeInputMethodManager_androidKt;
import androidx.compose.material3.BottomAppBarState;
import androidx.compose.material3.BottomSheetScaffoldKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.ChipKt;
import androidx.compose.material3.SheetValue;
import androidx.compose.material3.carousel.CarouselKt;
import androidx.compose.material3.carousel.CarouselPagerState;
import androidx.compose.material3.carousel.CarouselState;
import androidx.compose.material3.internal.ChildParentSemanticsKt;
import androidx.compose.material3.internal.ChildSemanticsNode;
import androidx.compose.runtime.CompositionLocalAccessorScope;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.spatial.RectListKt;
import androidx.compose.ui.text.TextLayoutResult;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class ed implements ky {
    public final /* synthetic */ int d;

    public /* synthetic */ ed(int i) {
        this.d = i;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 BasicTextField$lambda$26$0;
        w01 BasicTextField$lambda$29$0;
        w01 BasicTextField$lambda$32$0;
        Long valueOf;
        w01 drawContentWithoutBorder$lambda$0;
        BottomAppBarState Saver$lambda$1;
        boolean rememberStandardBottomSheetState$lambda$5$lambda$4;
        BringIntoViewSpec LocalBringIntoViewSpec$lambda$0;
        w01 Button$lambda$2$lambda$1;
        w01 cachePicture$lambda$0$0$0;
        w01 Carousel_cJHQLPU$lambda$16$lambda$15;
        w01 Carousel_cJHQLPU$lambda$18$lambda$17;
        w01 carouselItem$lambda$26$lambda$22;
        CarouselPagerState Saver$lambda$2;
        CarouselState Saver$lambda$3;
        w01 childSemantics$lambda$0;
        boolean onDetach$lambda$2;
        w01 SelectableChip_u0RnIRE$lambda$21$lambda$20;
        w01 Chip_nkUnTEs$lambda$17$lambda$16;
        w01 ClickableText_4YKlhWE$lambda$0$0;
        ComposeInputMethodManager ComposeInputMethodManagerFactory$lambda$0;
        w01 CoreTextField$lambda$0$0;
        w01 measure_3p2s80s$lambda$2;
        switch (this.d) {
            case 0:
                BasicTextField$lambda$26$0 = BasicTextFieldKt.BasicTextField$lambda$26$0((TextLayoutResult) obj);
                return BasicTextField$lambda$26$0;
            case 1:
                BasicTextField$lambda$29$0 = BasicTextFieldKt.BasicTextField$lambda$29$0((TextLayoutResult) obj);
                return BasicTextField$lambda$29$0;
            case 2:
                BasicTextField$lambda$32$0 = BasicTextFieldKt.BasicTextField$lambda$32$0((TextLayoutResult) obj);
                return BasicTextField$lambda$32$0;
            case 3:
                valueOf = Long.valueOf(((Long) obj).longValue());
                return valueOf;
            case 4:
                r80 r80Var = (r80) obj;
                r80Var.getClass();
                String str = (String) ((s80) ((u80) r80Var).a()).get(1);
                try {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
                    simpleDateFormat.setTimeZone(TimeZone.getDefault());
                    Date parse = simpleDateFormat.parse(str);
                    if (parse != null) {
                        return Long.valueOf(parse.getTime() / 1000);
                    }
                    return null;
                } catch (Exception unused) {
                    return null;
                }
            case 5:
                drawContentWithoutBorder$lambda$0 = BorderKt.drawContentWithoutBorder$lambda$0((ContentDrawScope) obj);
                return drawContentWithoutBorder$lambda$0;
            case 6:
                Saver$lambda$1 = BottomAppBarState.Companion.Saver$lambda$1((List) obj);
                return Saver$lambda$1;
            case 7:
                rememberStandardBottomSheetState$lambda$5$lambda$4 = BottomSheetScaffoldKt.rememberStandardBottomSheetState$lambda$5$lambda$4((SheetValue) obj);
                return Boolean.valueOf(rememberStandardBottomSheetState$lambda$5$lambda$4);
            case 8:
                LocalBringIntoViewSpec$lambda$0 = BringIntoViewSpec_androidKt.LocalBringIntoViewSpec$lambda$0((CompositionLocalAccessorScope) obj);
                return LocalBringIntoViewSpec$lambda$0;
            case 9:
                Button$lambda$2$lambda$1 = ButtonKt.Button$lambda$2$lambda$1((SemanticsPropertyReceiver) obj);
                return Button$lambda$2$lambda$1;
            case 10:
                cachePicture$lambda$0$0$0 = CacheDrawScopeDragShadowCallback.cachePicture$lambda$0$0$0((ContentDrawScope) obj);
                return cachePicture$lambda$0$0$0;
            case 11:
                Carousel_cJHQLPU$lambda$16$lambda$15 = CarouselKt.Carousel_cJHQLPU$lambda$16$lambda$15((SemanticsPropertyReceiver) obj);
                return Carousel_cJHQLPU$lambda$16$lambda$15;
            case Matrix.TranslateX /* 12 */:
                Carousel_cJHQLPU$lambda$18$lambda$17 = CarouselKt.Carousel_cJHQLPU$lambda$18$lambda$17((SemanticsPropertyReceiver) obj);
                return Carousel_cJHQLPU$lambda$18$lambda$17;
            case Matrix.TranslateY /* 13 */:
                carouselItem$lambda$26$lambda$22 = CarouselKt.carouselItem$lambda$26$lambda$22((Placeable.PlacementScope) obj);
                return carouselItem$lambda$26$lambda$22;
            case Matrix.TranslateZ /* 14 */:
                Saver$lambda$2 = CarouselPagerState.Saver$lambda$2((List) obj);
                return Saver$lambda$2;
            case 15:
                Saver$lambda$3 = CarouselState.Saver$lambda$3((List) obj);
                return Saver$lambda$3;
            case 16:
                childSemantics$lambda$0 = ChildParentSemanticsKt.childSemantics$lambda$0((SemanticsPropertyReceiver) obj);
                return childSemantics$lambda$0;
            case 17:
                onDetach$lambda$2 = ChildSemanticsNode.onDetach$lambda$2((TraversableNode) obj);
                return Boolean.valueOf(onDetach$lambda$2);
            case 18:
                SelectableChip_u0RnIRE$lambda$21$lambda$20 = ChipKt.SelectableChip_u0RnIRE$lambda$21$lambda$20((SemanticsPropertyReceiver) obj);
                return SelectableChip_u0RnIRE$lambda$21$lambda$20;
            case 19:
                Chip_nkUnTEs$lambda$17$lambda$16 = ChipKt.Chip_nkUnTEs$lambda$17$lambda$16((SemanticsPropertyReceiver) obj);
                return Chip_nkUnTEs$lambda$17$lambda$16;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                ClickableText_4YKlhWE$lambda$0$0 = ClickableTextKt.ClickableText_4YKlhWE$lambda$0$0((TextLayoutResult) obj);
                return ClickableText_4YKlhWE$lambda$0$0;
            case 21:
                ComposeInputMethodManagerFactory$lambda$0 = ComposeInputMethodManager_androidKt.ComposeInputMethodManagerFactory$lambda$0((View) obj);
                return ComposeInputMethodManagerFactory$lambda$0;
            case 22:
                CoreTextField$lambda$0$0 = CoreTextFieldKt.CoreTextField$lambda$0$0((TextLayoutResult) obj);
                return CoreTextField$lambda$0$0;
            case 23:
                measure_3p2s80s$lambda$2 = CoreTextFieldKt$CoreTextField$8$1$1$2.measure_3p2s80s$lambda$2((Placeable.PlacementScope) obj);
                return measure_3p2s80s$lambda$2;
            case 24:
                in inVar = (in) obj;
                if (inVar instanceof mn) {
                    return (mn) inVar;
                }
                return null;
            case RectListKt.BitOffsetForParentId /* 25 */:
                zn znVar = (zn) obj;
                znVar.getClass();
                String str2 = znVar.a;
                k10 k10Var = znVar.b;
                return str2 + ":" + k10Var.d + "-" + k10Var.e + ":" + znVar.c + ":" + znVar.d + ":" + yi.u0(znVar.e, ",", null, null, null, 62);
            case 26:
                zn znVar2 = (zn) obj;
                znVar2.getClass();
                return znVar2.a + "=cpu" + znVar2.b;
            case 27:
                int intValue = ((Integer) obj).intValue();
                return "printf 'zone" + intValue + ":'; cat /sys/class/thermal/thermal_zone" + intValue + "/type 2>/dev/null || true";
            case 28:
                zn znVar3 = (zn) obj;
                return znVar3.a + " = " + (znVar3.c / 1000) + " MHz";
            default:
                zn znVar4 = (zn) obj;
                return znVar4.a + "=cpu" + znVar4.b;
        }
    }
}
