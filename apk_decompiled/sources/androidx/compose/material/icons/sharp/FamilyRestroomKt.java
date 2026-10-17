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
import defpackage.bv;
import defpackage.fc;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FamilyRestroomKt {
    private static ImageVector _familyRestroom;

    public static final ImageVector getFamilyRestroom(Icons.Sharp sharp) {
        ImageVector imageVector = _familyRestroom;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.FamilyRestroom", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(16.0f, 4.0f);
        b.curveToRelative(0.0f, -1.11f, 0.89f, -2.0f, 2.0f, -2.0f);
        b.reflectiveCurveToRelative(2.0f, 0.89f, 2.0f, 2.0f);
        b.reflectiveCurveToRelative(-0.89f, 2.0f, -2.0f, 2.0f);
        b.reflectiveCurveTo(16.0f, 5.11f, 16.0f, 4.0f);
        uo.C(b, 20.0f, 22.0f, -6.0f, 2.5f);
        b.lineToRelative(-3.0f, -9.0f);
        b.lineToRelative(-3.0f, 0.0f);
        kp0.v(b, -1.17f, 3.5f, 17.0f, 22.0f);
        k4.w(b, 20.0f, 12.5f, 11.5f);
        b.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        b.reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f);
        b.reflectiveCurveTo(11.0f, 9.17f, 11.0f, 10.0f);
        b.reflectiveCurveTo(11.67f, 11.5f, 12.5f, 11.5f);
        b.close();
        b.moveTo(5.5f, 6.0f);
        b.curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        b.reflectiveCurveToRelative(-0.89f, -2.0f, -2.0f, -2.0f);
        b.reflectiveCurveToRelative(-2.0f, 0.89f, -2.0f, 2.0f);
        b.reflectiveCurveTo(4.39f, 6.0f, 5.5f, 6.0f);
        af0.A(b, 7.5f, 22.0f, -7.0f, 9.0f);
        bv.A(b, 7.0f, 2.0f, 8.0f, 1.5f);
        kf0.n(b, 7.0f, 7.5f, 14.0f, 22.0f);
        r6.D(b, -4.0f, 1.0f, -5.5f, -5.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.p(b, 18.0f, 1.0f, 4.0f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _familyRestroom = build;
        build.getClass();
        return build;
    }
}
