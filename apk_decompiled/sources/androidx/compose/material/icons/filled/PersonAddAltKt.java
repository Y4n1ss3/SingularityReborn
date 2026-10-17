package androidx.compose.material.icons.filled;

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
import defpackage.kp0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PersonAddAltKt {
    private static ImageVector _personAddAlt;

    public static final ImageVector getPersonAddAlt(Icons.Filled filled) {
        ImageVector imageVector = _personAddAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.PersonAddAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(13.0f, 8.0f);
        b.curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
        b.reflectiveCurveTo(5.0f, 5.79f, 5.0f, 8.0f);
        b.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        b.reflectiveCurveTo(13.0f, 10.21f, 13.0f, 8.0f);
        b.close();
        b.moveTo(11.0f, 8.0f);
        b.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        b.reflectiveCurveTo(7.0f, 9.1f, 7.0f, 8.0f);
        b.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        b.reflectiveCurveTo(11.0f, 6.9f, 11.0f, 8.0f);
        uo.C(b, 1.0f, 18.0f, 2.0f, 16.0f);
        b.verticalLineToRelative(-2.0f);
        b.curveToRelative(0.0f, -2.66f, -5.33f, -4.0f, -8.0f, -4.0f);
        b.reflectiveCurveTo(1.0f, 15.34f, 1.0f, 18.0f);
        b.close();
        b.moveTo(3.0f, 18.0f);
        b.curveToRelative(0.2f, -0.71f, 3.3f, -2.0f, 6.0f, -2.0f);
        b.curveToRelative(2.69f, 0.0f, 5.78f, 1.28f, 6.0f, 2.0f);
        kp0.D(b, 3.0f, 20.0f, 15.0f, -3.0f);
        af0.w(b, 3.0f, -2.0f, -3.0f, 7.0f);
        af0.v(b, -2.0f, 3.0f, -3.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.m(b, 3.0f, 3.0f, 20.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _personAddAlt = build;
        build.getClass();
        return build;
    }
}
