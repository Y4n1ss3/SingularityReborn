package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WatchKt {
    private static ImageVector _watch;

    public static final ImageVector getWatch(Icons.Outlined outlined) {
        ImageVector imageVector = _watch;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Watch", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(14.31f, 2.0f, 0.41f, 2.48f);
        e.curveTo(13.87f, 4.17f, 12.96f, 4.0f, 12.0f, 4.0f);
        e.curveToRelative(-0.95f, 0.0f, -1.87f, 0.17f, -2.71f, 0.47f);
        e.lineTo(9.7f, 2.0f);
        e.horizontalLineToRelative(4.61f);
        e.moveToRelative(0.41f, 17.52f);
        e.lineTo(14.31f, 22.0f);
        e.lineTo(9.7f, 22.0f);
        e.lineToRelative(-0.41f, -2.47f);
        e.curveToRelative(0.84f, 0.3f, 1.76f, 0.47f, 2.71f, 0.47f);
        e.curveToRelative(0.96f, 0.0f, 1.87f, -0.17f, 2.72f, -0.48f);
        e.moveTo(16.0f, 0.0f);
        e.lineTo(8.0f, 0.0f);
        e.lineToRelative(-0.95f, 5.73f);
        e.curveTo(5.19f, 7.19f, 4.0f, 9.45f, 4.0f, 12.0f);
        e.reflectiveCurveToRelative(1.19f, 4.81f, 3.05f, 6.27f);
        e.lineTo(8.0f, 24.0f);
        e.horizontalLineToRelative(8.0f);
        e.lineToRelative(0.96f, -5.73f);
        e.curveTo(18.81f, 16.81f, 20.0f, 14.54f, 20.0f, 12.0f);
        e.reflectiveCurveToRelative(-1.19f, -4.81f, -3.04f, -6.27f);
        uo.l(e, 16.0f, 0.0f, 12.0f, 18.0f);
        e.curveToRelative(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        e.reflectiveCurveToRelative(2.69f, -6.0f, 6.0f, -6.0f);
        e.reflectiveCurveToRelative(6.0f, 2.69f, 6.0f, 6.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(e, -2.69f, 6.0f, -6.0f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _watch = build;
        build.getClass();
        return build;
    }
}
