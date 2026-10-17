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
import defpackage.af0;
import defpackage.bv;
import defpackage.fc;
import defpackage.j50;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MedicalInformationKt {
    private static ImageVector _medicalInformation;

    public static final ImageVector getMedicalInformation(Icons.Outlined outlined) {
        ImageVector imageVector = _medicalInformation;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.MedicalInformation", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = j50.e(20.0f, 7.0f, -5.0f, 4.0f);
        e.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        e.horizontalLineToRelative(-2.0f);
        e.curveTo(9.9f, 2.0f, 9.0f, 2.9f, 9.0f, 4.0f);
        e.verticalLineToRelative(3.0f);
        e.horizontalLineTo(4.0f);
        e.curveTo(2.9f, 7.0f, 2.0f, 7.9f, 2.0f, 9.0f);
        e.verticalLineToRelative(11.0f);
        e.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        e.horizontalLineToRelative(16.0f);
        e.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        e.verticalLineTo(9.0f);
        e.curveTo(22.0f, 7.9f, 21.1f, 7.0f, 20.0f, 7.0f);
        r6.B(e, 11.0f, 4.0f, 2.0f, 5.0f);
        uo.r(e, -2.0f, 4.0f, 20.0f, 20.0f);
        uf.t(e, 4.0f, 9.0f, 5.0f);
        e.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        e.horizontalLineToRelative(2.0f);
        e.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        uo.r(e, 5.0f, 20.0f, 11.0f, 16.0f);
        af0.o(e, 9.0f, 2.0f, 7.0f, -2.0f);
        uf.k(e, 5.0f, -2.0f, 2.0f, -2.0f);
        bv.l(e, 2.0f, 2.0f, 2.0f, 16.0f);
        kp0.t(e, 13.0f, 14.5f, 13.0f, 6.0f);
        kf0.n(e, 1.5f, 13.0f, 13.0f, 17.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.p(e, 16.0f, 4.0f, 1.5f, 13.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _medicalInformation = build;
        build.getClass();
        return build;
    }
}
