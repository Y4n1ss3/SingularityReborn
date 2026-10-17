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
import defpackage.j50;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HeadsetOffKt {
    private static ImageVector _headsetOff;

    public static final ImageVector getHeadsetOff(Icons.Sharp sharp) {
        ImageVector imageVector = _headsetOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.HeadsetOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 4.0f);
        b.curveToRelative(3.87f, 0.0f, 7.0f, 3.13f, 7.0f, 7.0f);
        kf0.z(b, 1.0f, -4.0f, 0.17f);
        b.lineToRelative(6.0f, 6.0f);
        b.verticalLineTo(11.0f);
        b.curveToRelative(0.0f, -4.97f, -4.03f, -9.0f, -9.0f, -9.0f);
        b.curveTo(9.98f, 2.0f, 8.12f, 2.67f, 6.62f, 3.8f);
        b.lineToRelative(1.43f, 1.43f);
        b.curveTo(9.17f, 4.45f, 10.53f, 4.0f, 12.0f, 4.0f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(2.1f, 2.1f, 0.69f, 3.51f);
        i.lineToRelative(3.33f, 3.33f);
        i.curveTo(3.37f, 8.09f, 3.0f, 9.5f, 3.0f, 11.0f);
        uf.s(i, 9.0f, 6.0f, -8.0f, 5.0f);
        i.verticalLineToRelative(-1.0f);
        i.curveToRelative(0.0f, -0.94f, 0.19f, -1.83f, 0.52f, -2.65f);
        fc.t(i, 15.0f, 17.83f, 20.0f, 2.17f);
        j50.x(i, 1.0f, 1.0f, 12.0f, 2.0f);
        i.horizontalLineToRelative(8.17f);
        i.lineToRelative(0.31f, 0.31f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(i, 1.41f, -1.41f, 2.1f, 2.1f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _headsetOff = build;
        build.getClass();
        return build;
    }
}
