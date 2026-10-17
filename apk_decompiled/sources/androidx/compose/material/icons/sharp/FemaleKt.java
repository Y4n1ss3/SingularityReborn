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
import defpackage.bv;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FemaleKt {
    private static ImageVector _female;

    public static final ImageVector getFemale(Icons.Sharp sharp) {
        ImageVector imageVector = _female;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Female", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(17.5f, 9.5f);
        b.curveTo(17.5f, 6.46f, 15.04f, 4.0f, 12.0f, 4.0f);
        b.reflectiveCurveTo(6.5f, 6.46f, 6.5f, 9.5f);
        b.curveToRelative(0.0f, 2.7f, 1.94f, 4.93f, 4.5f, 5.4f);
        bv.A(b, 17.0f, 9.0f, 2.0f, 2.0f);
        r6.D(b, 2.0f, 2.0f, -2.0f, 2.0f);
        kf0.z(b, -2.0f, -2.0f, -2.1f);
        b.curveTo(15.56f, 14.43f, 17.5f, 12.2f, 17.5f, 9.5f);
        b.close();
        b.moveTo(8.5f, 9.5f);
        b.curveTo(8.5f, 7.57f, 10.07f, 6.0f, 12.0f, 6.0f);
        b.reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f);
        b.reflectiveCurveTo(13.93f, 13.0f, 12.0f, 13.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 8.5f, 11.43f, 8.5f, 9.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _female = build;
        build.getClass();
        return build;
    }
}
