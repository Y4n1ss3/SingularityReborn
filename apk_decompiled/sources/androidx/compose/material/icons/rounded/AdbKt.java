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
import defpackage.bv;
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AdbKt {
    private static ImageVector _adb;

    public static final ImageVector getAdb(Icons.Rounded rounded) {
        ImageVector imageVector = _adb;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Adb", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(5.0f, 16.0f);
        b.curveToRelative(0.0f, 3.87f, 3.13f, 7.0f, 7.0f, 7.0f);
        b.reflectiveCurveToRelative(7.0f, -3.13f, 7.0f, -7.0f);
        bv.n(b, -4.0f, 5.0f, 12.0f, 4.0f);
        b.moveTo(16.12f, 4.37f);
        b.lineToRelative(2.1f, -2.1f);
        b.lineToRelative(-0.82f, -0.83f);
        b.lineToRelative(-2.3f, 2.31f);
        b.curveTo(14.16f, 3.28f, 13.12f, 3.0f, 12.0f, 3.0f);
        b.reflectiveCurveToRelative(-2.16f, 0.28f, -3.09f, 0.75f);
        b.lineTo(6.6f, 1.44f);
        b.lineToRelative(-0.82f, 0.83f);
        b.lineToRelative(2.1f, 2.1f);
        b.curveTo(6.14f, 5.64f, 5.0f, 7.68f, 5.0f, 10.0f);
        kf0.z(b, 1.0f, 14.0f, -1.0f);
        b.curveToRelative(0.0f, -2.32f, -1.14f, -4.36f, -2.88f, -5.63f);
        b.close();
        b.moveTo(9.0f, 9.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        b.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        b.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        b.close();
        b.moveTo(15.0f, 9.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        b.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(b, -0.45f, 1.0f, -1.0f, 1.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _adb = build;
        build.getClass();
        return build;
    }
}
