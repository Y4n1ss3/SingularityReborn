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
import defpackage.bv;
import defpackage.fc;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DirectionsKt {
    private static ImageVector _directions;

    public static final ImageVector getDirections(Icons.TwoTone twoTone) {
        ImageVector imageVector = _directions;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Directions", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(3.01f, 12.0f, 9.0f, 9.0f);
        e.lineTo(21.0f, 12.0f);
        fc.C(e, -9.0f, -9.0f, -8.99f, 9.0f);
        e.moveTo(14.0f, 7.5f);
        e.lineToRelative(3.5f, 3.5f);
        fc.u(e, -3.5f, 3.5f, 12.0f, -4.0f);
        r6.s(e, 3.0f, 8.0f, -4.0f);
        e.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(e, 5.0f, 7.5f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(13.42f, 1.58f);
        b.curveToRelative(-0.75f, -0.75f, -2.07f, -0.76f, -2.83f, 0.0f);
        b.lineToRelative(-9.0f, 9.0f);
        b.curveToRelative(-0.78f, 0.78f, -0.78f, 2.04f, 0.0f, 2.82f);
        b.lineToRelative(9.0f, 9.0f);
        b.curveToRelative(0.39f, 0.39f, 0.9f, 0.58f, 1.41f, 0.58f);
        b.curveToRelative(0.51f, 0.0f, 1.02f, -0.19f, 1.41f, -0.58f);
        b.lineToRelative(8.99f, -8.99f);
        b.curveToRelative(0.78f, -0.76f, 0.79f, -2.03f, 0.02f, -2.82f);
        fc.B(b, -9.0f, -9.01f, 12.01f, 20.99f);
        b.lineToRelative(-9.0f, -9.0f);
        b.lineToRelative(9.0f, -9.0f);
        fc.C(b, 9.0f, 9.0f, -9.0f, 9.0f);
        bv.y(b, 8.0f, 11.0f, 4.0f, 2.0f);
        kf0.z(b, -3.0f, 4.0f, 2.5f);
        b.lineToRelative(3.5f, -3.5f);
        b.lineTo(14.0f, 7.5f);
        b.lineTo(14.0f, 10.0f);
        b.lineTo(9.0f, 10.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _directions = build;
        build.getClass();
        return build;
    }
}
