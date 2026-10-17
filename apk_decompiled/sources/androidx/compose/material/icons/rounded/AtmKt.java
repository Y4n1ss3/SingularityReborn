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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AtmKt {
    private static ImageVector _atm;

    public static final ImageVector getAtm(Icons.Rounded rounded) {
        ImageVector imageVector = _atm;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Atm", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(8.0f, 9.75f);
        b.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        b.horizontalLineToRelative(1.5f);
        b.verticalLineToRelative(3.75f);
        b.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        b.reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f);
        b.lineTo(11.75f, 10.5f);
        b.horizontalLineToRelative(1.5f);
        b.curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f);
        b.reflectiveCurveTo(13.66f, 9.0f, 13.25f, 9.0f);
        b.horizontalLineToRelative(-4.5f);
        b.curveToRelative(-0.41f, 0.0f, -0.75f, 0.34f, -0.75f, 0.75f);
        k4.r(b, 6.0f, 9.0f, 3.0f, 9.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.verticalLineToRelative(4.25f);
        b.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        b.reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f);
        kf0.z(b, -0.75f, 2.0f, 0.75f);
        b.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        b.reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f);
        b.lineTo(7.0f, 10.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        r6.B(b, 5.5f, 12.0f, -2.0f, -1.5f);
        gy.n(b, 2.0f, 5.5f, 12.0f);
        b.moveTo(21.0f, 9.0f);
        b.horizontalLineToRelative(-4.5f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.verticalLineToRelative(4.25f);
        b.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        b.reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f);
        fc.w(b, 17.0f, 10.5f, 1.0f, 2.75f);
        b.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        b.reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f);
        kf0.z(b, -2.76f, 1.0f, 3.76f);
        b.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        b.reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f);
        b.lineTo(22.0f, 10.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _atm = build;
        build.getClass();
        return build;
    }
}
