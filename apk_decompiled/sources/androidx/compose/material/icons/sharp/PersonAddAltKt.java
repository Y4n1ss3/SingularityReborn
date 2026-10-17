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
import defpackage.fc;
import defpackage.gy;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PersonAddAltKt {
    private static ImageVector _personAddAlt;

    public static final ImageVector getPersonAddAlt(Icons.Sharp sharp) {
        ImageVector imageVector = _personAddAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.PersonAddAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(15.39f, 14.56f);
        b.curveTo(13.71f, 13.7f, 11.53f, 13.0f, 9.0f, 13.0f);
        b.curveToRelative(-2.53f, 0.0f, -4.71f, 0.7f, -6.39f, 1.56f);
        b.curveTo(1.61f, 15.07f, 1.0f, 16.1f, 1.0f, 17.22f);
        kf0.r(b, 20.0f, 16.0f, -2.78f);
        b.curveTo(17.0f, 16.1f, 16.39f, 15.07f, 15.39f, 14.56f);
        b.close();
        b.moveTo(9.0f, 12.0f);
        b.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        b.curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
        b.reflectiveCurveTo(5.0f, 5.79f, 5.0f, 8.0f);
        b.curveTo(5.0f, 10.21f, 6.79f, 12.0f, 9.0f, 12.0f);
        fc.A(b, 20.0f, 9.0f, 6.0f, -2.0f);
        r6.D(b, 3.0f, -3.0f, 2.0f, 3.0f);
        r6.D(b, 3.0f, 2.0f, -3.0f, 3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.e(b, 9.0f, 20.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _personAddAlt = build;
        build.getClass();
        return build;
    }
}
