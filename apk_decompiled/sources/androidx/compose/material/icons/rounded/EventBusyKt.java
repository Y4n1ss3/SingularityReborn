package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.af0;
import defpackage.fc;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EventBusyKt {
    private static ImageVector _eventBusy;

    public static final ImageVector getEventBusy(Icons.Rounded rounded) {
        ImageVector imageVector = _eventBusy;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.EventBusy", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(9.84f, 16.47f, 1.91f, -1.91f);
        e.lineToRelative(1.91f, 1.91f);
        e.curveToRelative(0.29f, 0.29f, 0.77f, 0.29f, 1.06f, 0.0f);
        e.curveToRelative(0.29f, -0.29f, 0.29f, -0.77f, 0.0f, -1.06f);
        e.lineToRelative(-1.91f, -1.91f);
        e.lineToRelative(1.91f, -1.91f);
        e.curveToRelative(0.29f, -0.29f, 0.29f, -0.77f, 0.0f, -1.06f);
        e.curveToRelative(-0.29f, -0.29f, -0.77f, -0.29f, -1.06f, 0.0f);
        e.lineToRelative(-1.91f, 1.91f);
        e.lineToRelative(-1.91f, -1.91f);
        e.curveToRelative(-0.29f, -0.29f, -0.77f, -0.29f, -1.06f, 0.0f);
        e.curveToRelative(-0.29f, 0.29f, -0.29f, 0.77f, 0.0f, 1.06f);
        e.lineToRelative(1.91f, 1.91f);
        e.lineToRelative(-1.91f, 1.91f);
        e.curveToRelative(-0.29f, 0.29f, -0.29f, 0.77f, 0.0f, 1.06f);
        e.curveToRelative(0.29f, 0.29f, 0.77f, 0.29f, 1.06f, 0.0f);
        af0.l(e, 19.0f, 3.0f, -1.0f);
        e.lineTo(18.0f, 2.0f);
        e.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        e.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        e.verticalLineToRelative(1.0f);
        e.lineTo(8.0f, 3.0f);
        e.lineTo(8.0f, 2.0f);
        e.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        e.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        e.verticalLineToRelative(1.0f);
        e.lineTo(5.0f, 3.0f);
        e.curveToRelative(-1.11f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        e.lineTo(3.0f, 19.0f);
        e.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        e.horizontalLineToRelative(14.0f);
        e.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        e.lineTo(21.0f, 5.0f);
        e.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.r(e, 18.0f, 19.0f, 6.0f, 19.0f);
        e.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        fc.w(e, 5.0f, 8.0f, 14.0f, 10.0f);
        e.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _eventBusy = build;
        build.getClass();
        return build;
    }
}
