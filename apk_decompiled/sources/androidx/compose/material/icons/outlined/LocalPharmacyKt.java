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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LocalPharmacyKt {
    private static ImageVector _localPharmacy;

    public static final ImageVector getLocalPharmacy(Icons.Outlined outlined) {
        ImageVector imageVector = _localPharmacy;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.LocalPharmacy", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = uo.i(21.0f, 5.0f, -2.64f, 1.14f, -3.14f);
        i.lineTo(17.15f, 1.0f);
        i.lineToRelative(-1.46f, 4.0f);
        i.lineTo(3.0f, 5.0f);
        i.verticalLineToRelative(2.0f);
        i.lineToRelative(2.0f, 6.0f);
        r6.A(i, -2.0f, 6.0f, 2.0f, 18.0f);
        i.verticalLineToRelative(-2.0f);
        i.lineToRelative(-2.0f, -6.0f);
        gy.B(i, 2.0f, -6.0f, 21.0f, 5.0f);
        i.moveTo(17.1f, 13.63f);
        i.lineTo(18.89f, 19.0f);
        i.lineTo(5.11f, 19.0f);
        i.lineToRelative(1.79f, -5.37f);
        i.lineToRelative(0.21f, -0.63f);
        i.lineToRelative(-0.21f, -0.63f);
        i.lineTo(5.11f, 7.0f);
        i.horizontalLineToRelative(13.78f);
        i.lineToRelative(-1.79f, 5.37f);
        fc.C(i, -0.21f, 0.63f, 0.21f, 0.63f);
        k4.C(i, 13.0f, 9.0f, -2.0f, 3.0f);
        af0.m(i, 8.0f, 12.0f, 2.0f, 3.0f);
        r6.D(i, 3.0f, 2.0f, -3.0f, 3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.s(i, -2.0f, -3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _localPharmacy = build;
        build.getClass();
        return build;
    }
}
