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
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WatchKt {
    private static ImageVector _watch;

    public static final ImageVector getWatch(Icons.Rounded rounded) {
        ImageVector imageVector = _watch;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Watch", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(20.0f, 12.0f);
        b.curveToRelative(0.0f, -2.54f, -1.19f, -4.81f, -3.04f, -6.27f);
        b.lineToRelative(-0.68f, -4.06f);
        b.curveTo(16.12f, 0.71f, 15.28f, 0.0f, 14.31f, 0.0f);
        b.horizontalLineTo(9.7f);
        b.curveToRelative(-0.98f, 0.0f, -1.82f, 0.71f, -1.98f, 1.67f);
        b.lineToRelative(-0.67f, 4.06f);
        b.curveTo(5.19f, 7.19f, 4.0f, 9.45f, 4.0f, 12.0f);
        b.reflectiveCurveToRelative(1.19f, 4.81f, 3.05f, 6.27f);
        b.lineToRelative(0.67f, 4.06f);
        b.curveToRelative(0.16f, 0.96f, 1.0f, 1.67f, 1.98f, 1.67f);
        b.horizontalLineToRelative(4.61f);
        b.curveToRelative(0.98f, 0.0f, 1.81f, -0.71f, 1.97f, -1.67f);
        b.lineToRelative(0.68f, -4.06f);
        b.curveTo(18.81f, 16.81f, 20.0f, 14.54f, 20.0f, 12.0f);
        b.close();
        b.moveTo(6.0f, 12.0f);
        b.curveToRelative(0.0f, -3.31f, 2.69f, -6.0f, 6.0f, -6.0f);
        b.reflectiveCurveToRelative(6.0f, 2.69f, 6.0f, 6.0f);
        b.reflectiveCurveToRelative(-2.69f, 6.0f, -6.0f, 6.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(b, -6.0f, -2.69f, -6.0f, -6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _watch = build;
        build.getClass();
        return build;
    }
}
