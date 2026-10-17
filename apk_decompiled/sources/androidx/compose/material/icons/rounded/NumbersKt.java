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
import defpackage.kf0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NumbersKt {
    private static ImageVector _numbers;

    public static final ImageVector getNumbers(Icons.Rounded rounded) {
        ImageVector imageVector = _numbers;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Numbers", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(20.68f, 9.27f, 0.01f, -0.06f);
        e.curveTo(20.85f, 8.59f, 20.39f, 8.0f, 19.76f, 8.0f);
        e.horizontalLineTo(17.0f);
        e.lineToRelative(0.7f, -2.79f);
        e.curveTo(17.85f, 4.59f, 17.39f, 4.0f, 16.76f, 4.0f);
        e.horizontalLineToRelative(0.0f);
        e.curveToRelative(-0.45f, 0.0f, -0.83f, 0.3f, -0.94f, 0.73f);
        e.lineTo(15.0f, 8.0f);
        e.horizontalLineToRelative(-4.0f);
        e.lineToRelative(0.7f, -2.79f);
        e.curveTo(11.85f, 4.59f, 11.39f, 4.0f, 10.76f, 4.0f);
        e.horizontalLineToRelative(0.0f);
        e.curveToRelative(-0.45f, 0.0f, -0.83f, 0.3f, -0.94f, 0.73f);
        e.lineTo(9.0f, 8.0f);
        e.horizontalLineTo(5.76f);
        e.curveTo(5.31f, 8.0f, 4.92f, 8.3f, 4.82f, 8.73f);
        e.lineTo(4.8f, 8.79f);
        e.curveTo(4.65f, 9.41f, 5.11f, 10.0f, 5.74f, 10.0f);
        fc.z(e, 8.5f, -1.0f, 4.0f, 4.26f);
        e.curveToRelative(-0.45f, 0.0f, -0.83f, 0.3f, -0.94f, 0.73f);
        e.lineTo(3.3f, 14.79f);
        e.curveTo(3.15f, 15.41f, 3.61f, 16.0f, 4.24f, 16.0f);
        e.horizontalLineTo(7.0f);
        e.lineToRelative(-0.7f, 2.79f);
        e.curveTo(6.15f, 19.41f, 6.61f, 20.0f, 7.24f, 20.0f);
        e.horizontalLineToRelative(0.0f);
        e.curveToRelative(0.45f, 0.0f, 0.83f, -0.3f, 0.94f, -0.73f);
        e.lineTo(9.0f, 16.0f);
        e.horizontalLineToRelative(4.0f);
        e.lineToRelative(-0.7f, 2.79f);
        e.curveTo(12.15f, 19.41f, 12.61f, 20.0f, 13.24f, 20.0f);
        e.horizontalLineToRelative(0.0f);
        e.curveToRelative(0.45f, 0.0f, 0.83f, -0.3f, 0.94f, -0.73f);
        e.lineTo(15.0f, 16.0f);
        e.horizontalLineToRelative(3.24f);
        e.curveToRelative(0.45f, 0.0f, 0.83f, -0.3f, 0.94f, -0.73f);
        e.lineToRelative(0.01f, -0.06f);
        e.curveToRelative(0.15f, -0.61f, -0.31f, -1.21f, -0.94f, -1.21f);
        uo.g(e, 15.5f, 1.0f, -4.0f, 3.24f);
        e.curveTo(20.19f, 10.0f, 20.58f, 9.7f, 20.68f, 9.27f);
        af0.l(e, 13.5f, 14.0f, -4.0f);
        e.lineToRelative(1.0f, -4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.d(e, 4.0f, 13.5f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _numbers = build;
        build.getClass();
        return build;
    }
}
