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
import defpackage.fc;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NoBackpackKt {
    private static ImageVector _noBackpack;

    public static final ImageVector getNoBackpack(Icons.TwoTone twoTone) {
        ImageVector imageVector = _noBackpack;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.NoBackpack", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(18.0f, 15.17f, 8.0f);
        d.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        uo.g(d, 8.83f, 6.0f, 6.0f, 1.67f);
        kf0.t(d, 1.67f, 18.0f, 15.17f);
        d.moveTo(17.17f, 20.0f);
        j50.x(d, -6.0f, -6.0f, 7.5f, -2.0f);
        fc.s(d, 1.67f, 6.0f, 8.83f, 20.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.h(d, 17.17f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(6.98f, 4.15f);
        b.curveToRelative(0.01f, 0.0f, 0.01f, -0.01f, 0.02f, -0.01f);
        uf.p(b, 2.0f, 3.0f, 2.0f, 4.0f);
        kf0.r(b, 2.0f, 3.0f, 2.14f);
        b.curveToRelative(1.72f, 0.45f, 3.0f, 2.0f, 3.0f, 3.86f);
        k4.z(b, 9.17f, -2.0f, -2.0f, 8.0f);
        b.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        kf0.m(b, 8.83f, 6.98f, 4.15f);
        b.moveTo(14.83f, 12.0f);
        kp0.k(b, 1.67f, 1.67f, 12.0f, 14.83f);
        b.moveTo(19.78f, 22.61f);
        b.lineToRelative(-0.85f, -0.85f);
        b.curveTo(18.65f, 21.91f, 18.34f, 22.0f, 18.0f, 22.0f);
        b.horizontalLineTo(6.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        b.verticalLineTo(8.0f);
        b.curveToRelative(0.0f, -0.36f, 0.06f, -0.69f, 0.15f, -1.02f);
        b.lineTo(1.39f, 4.22f);
        b.lineToRelative(1.41f, -1.41f);
        gy.B(b, 18.38f, 18.38f, 19.78f, 22.61f);
        b.moveTo(17.17f, 20.0f);
        j50.x(b, -6.0f, -6.0f, 7.5f, -2.0f);
        fc.s(b, 1.67f, 6.0f, 8.83f, 20.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.h(b, 17.17f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noBackpack = build;
        build.getClass();
        return build;
    }
}
