package androidx.compose.material.icons.sharp;

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
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SoapKt {
    private static ImageVector _soap;

    public static final ImageVector getSoap(Icons.Sharp sharp) {
        ImageVector imageVector = _soap;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Soap", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(14.25f, 6.0f);
        b.curveTo(14.66f, 6.0f, 15.0f, 6.34f, 15.0f, 6.75f);
        b.reflectiveCurveTo(14.66f, 7.5f, 14.25f, 7.5f);
        b.reflectiveCurveTo(13.5f, 7.16f, 13.5f, 6.75f);
        b.reflectiveCurveTo(13.84f, 6.0f, 14.25f, 6.0f);
        b.moveTo(14.25f, 4.5f);
        b.curveTo(13.01f, 4.5f, 12.0f, 5.51f, 12.0f, 6.75f);
        b.reflectiveCurveTo(13.01f, 9.0f, 14.25f, 9.0f);
        b.reflectiveCurveToRelative(2.25f, -1.01f, 2.25f, -2.25f);
        b.reflectiveCurveTo(15.49f, 4.5f, 14.25f, 4.5f);
        uo.l(b, 14.25f, 4.5f, 20.0f, 5.5f);
        b.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        b.reflectiveCurveTo(20.28f, 6.5f, 20.0f, 6.5f);
        b.reflectiveCurveTo(19.5f, 6.28f, 19.5f, 6.0f);
        b.reflectiveCurveTo(19.72f, 5.5f, 20.0f, 5.5f);
        b.moveTo(20.0f, 4.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        b.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        b.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        b.reflectiveCurveTo(21.1f, 4.0f, 20.0f, 4.0f);
        uo.l(b, 20.0f, 4.0f, 18.0f, 2.5f);
        b.curveTo(18.0f, 3.33f, 17.33f, 4.0f, 16.5f, 4.0f);
        b.curveTo(15.67f, 4.0f, 15.0f, 3.33f, 15.0f, 2.5f);
        b.reflectiveCurveTo(15.67f, 1.0f, 16.5f, 1.0f);
        b.curveTo(17.33f, 1.0f, 18.0f, 1.67f, 18.0f, 2.5f);
        fc.A(b, 1.0f, 12.68f, 23.0f, 18.0f);
        r6.D(b, -2.5f, -7.0f, -1.0f, 9.0f);
        uf.p(b, 17.0f, -9.0f, -1.0f, 10.0f);
        af0.B(b, -2.5f, 12.0f, -1.0f, 8.0f);
        b.verticalLineTo(10.0f);
        b.horizontalLineTo(8.86f);
        b.lineToRelative(1.88f, -3.3f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(b, 9.12f, 5.0f, 1.0f, 12.68f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _soap = build;
        build.getClass();
        return build;
    }
}
