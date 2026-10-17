package androidx.compose.material.icons.twotone;

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
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Rotate90DegreesCcwKt {
    private static ImageVector _rotate90DegreesCcw;

    public static final ImageVector getRotate90DegreesCcw(Icons.TwoTone twoTone) {
        ImageVector imageVector = _rotate90DegreesCcw;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Rotate90DegreesCcw", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(af0.i(7.35f, 9.24f, 3.69f, 12.9f), 3.65f, 3.66f, 11.0f, 12.9f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(7.34f, 6.41f, 0.86f, 12.9f);
        i.lineToRelative(6.49f, 6.48f);
        fc.C(i, 6.49f, -6.48f, -6.5f, -6.49f);
        i.moveTo(7.34f, 16.56f);
        i.lineTo(3.69f, 12.9f);
        i.lineToRelative(3.66f, -3.66f);
        bv.o(i, 11.0f, 12.9f, -3.66f, 3.66f);
        i.moveTo(19.36f, 6.64f);
        i.curveTo(17.61f, 4.88f, 15.3f, 4.0f, 13.0f, 4.0f);
        i.lineTo(13.0f, 0.76f);
        i.lineTo(8.76f, 5.0f);
        i.lineTo(13.0f, 9.24f);
        i.lineTo(13.0f, 6.0f);
        i.curveToRelative(1.79f, 0.0f, 3.58f, 0.68f, 4.95f, 2.05f);
        i.curveToRelative(2.73f, 2.73f, 2.73f, 7.17f, 0.0f, 9.9f);
        i.curveTo(16.58f, 19.32f, 14.79f, 20.0f, 13.0f, 20.0f);
        i.curveToRelative(-0.97f, 0.0f, -1.94f, -0.21f, -2.84f, -0.61f);
        i.lineToRelative(-1.49f, 1.49f);
        i.curveTo(10.02f, 21.62f, 11.51f, 22.0f, 13.0f, 22.0f);
        i.curveToRelative(2.3f, 0.0f, 4.61f, -0.88f, 6.36f, -2.64f);
        i.curveToRelative(3.52f, -3.51f, 3.52f, -9.21f, 0.0f, -12.72f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rotate90DegreesCcw = build;
        build.getClass();
        return build;
    }
}
