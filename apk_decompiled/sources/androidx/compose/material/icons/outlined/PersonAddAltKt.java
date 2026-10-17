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
import defpackage.k4;
import defpackage.kf0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PersonAddAltKt {
    private static ImageVector _personAddAlt;

    public static final ImageVector getPersonAddAlt(Icons.Outlined outlined) {
        ImageVector imageVector = _personAddAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PersonAddAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder c = af0.c(20.0f, 9.0f, 6.0f, -2.0f, 3.0f);
        af0.v(c, -3.0f, 2.0f, 3.0f, 3.0f);
        af0.w(c, 2.0f, -3.0f, 3.0f, 9.0f);
        k4.w(c, 20.0f, 9.0f, 12.0f);
        c.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        c.curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
        c.reflectiveCurveTo(5.0f, 5.79f, 5.0f, 8.0f);
        c.curveTo(5.0f, 10.21f, 6.79f, 12.0f, 9.0f, 12.0f);
        c.close();
        c.moveTo(9.0f, 6.0f);
        c.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        c.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        c.reflectiveCurveTo(7.0f, 9.1f, 7.0f, 8.0f);
        c.curveTo(7.0f, 6.9f, 7.9f, 6.0f, 9.0f, 6.0f);
        c.close();
        c.moveTo(15.39f, 14.56f);
        c.curveTo(13.71f, 13.7f, 11.53f, 13.0f, 9.0f, 13.0f);
        c.curveToRelative(-2.53f, 0.0f, -4.71f, 0.7f, -6.39f, 1.56f);
        c.curveTo(1.61f, 15.07f, 1.0f, 16.1f, 1.0f, 17.22f);
        kf0.r(c, 20.0f, 16.0f, -2.78f);
        c.curveTo(17.0f, 16.1f, 16.39f, 15.07f, 15.39f, 14.56f);
        uo.q(c, 15.0f, 18.0f, 3.0f, -0.78f);
        c.curveToRelative(0.0f, -0.38f, 0.2f, -0.72f, 0.52f, -0.88f);
        c.curveTo(4.71f, 15.73f, 6.63f, 15.0f, 9.0f, 15.0f);
        c.curveToRelative(2.37f, 0.0f, 4.29f, 0.73f, 5.48f, 1.34f);
        c.curveTo(14.8f, 16.5f, 15.0f, 16.84f, 15.0f, 17.22f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(c, 18.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _personAddAlt = build;
        build.getClass();
        return build;
    }
}
