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
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DryCleaningKt {
    private static ImageVector _dryCleaning;

    public static final ImageVector getDryCleaning(Icons.Sharp sharp) {
        ImageVector imageVector = _dryCleaning;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.DryCleaning", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder j = kf0.j(21.0f, 12.0f, -8.0f, -3.56f, 6.0f);
        j.horizontalLineToRelative(-1.0f);
        j.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        j.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        j.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        j.horizontalLineToRelative(2.0f);
        j.curveToRelative(0.0f, -1.84f, -1.66f, -3.3f, -3.56f, -2.95f);
        j.curveTo(10.26f, 2.27f, 9.29f, 3.22f, 9.06f, 4.4f);
        j.curveTo(8.76f, 5.96f, 9.66f, 7.34f, 11.0f, 7.82f);
        j.verticalLineToRelative(0.63f);
        j.lineToRelative(-8.0f, 3.56f);
        fc.w(j, 3.0f, 16.0f, 4.0f, 6.0f);
        bv.l(j, 10.0f, -6.0f, 4.0f, 12.0f);
        k4.C(j, 19.0f, 14.0f, -2.0f, -1.0f);
        af0.o(j, 7.0f, 1.0f, 5.0f, -0.7f);
        j.lineToRelative(7.0f, -3.11f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.j(j, 7.0f, 3.11f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dryCleaning = build;
        build.getClass();
        return build;
    }
}
