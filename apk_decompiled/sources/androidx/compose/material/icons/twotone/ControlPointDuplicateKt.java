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
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ControlPointDuplicateKt {
    private static ImageVector _controlPointDuplicate;

    public static final ImageVector getControlPointDuplicate(Icons.TwoTone twoTone) {
        ImageVector imageVector = _controlPointDuplicate;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.ControlPointDuplicate", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(15.0f, 5.0f);
        b.curveToRelative(-3.86f, 0.0f, -7.0f, 3.14f, -7.0f, 7.0f);
        b.reflectiveCurveToRelative(3.14f, 7.0f, 7.0f, 7.0f);
        b.reflectiveCurveToRelative(7.0f, -3.14f, 7.0f, -7.0f);
        b.reflectiveCurveToRelative(-3.14f, -7.0f, -7.0f, -7.0f);
        r6.B(b, 19.0f, 13.0f, -3.0f, 3.0f);
        af0.v(b, -2.0f, -3.0f, -3.0f, -2.0f);
        uo.n(b, 3.0f, 14.0f, 8.0f, 2.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.r(b, 3.0f, 3.0f, 2.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(16.0f, 8.0f, -2.0f, 3.0f, -3.0f);
        r6.D(n, 2.0f, 3.0f, 3.0f, 2.0f);
        af0.C(n, -3.0f, 3.0f, -2.0f, -3.0f);
        n.moveTo(15.0f, 3.0f);
        n.curveToRelative(-4.96f, 0.0f, -9.0f, 4.04f, -9.0f, 9.0f);
        n.reflectiveCurveToRelative(4.04f, 9.0f, 9.0f, 9.0f);
        n.reflectiveCurveToRelative(9.0f, -4.04f, 9.0f, -9.0f);
        n.reflectiveCurveToRelative(-4.04f, -9.0f, -9.0f, -9.0f);
        n.close();
        n.moveTo(15.0f, 19.0f);
        n.curveToRelative(-3.86f, 0.0f, -7.0f, -3.14f, -7.0f, -7.0f);
        n.reflectiveCurveToRelative(3.14f, -7.0f, 7.0f, -7.0f);
        n.reflectiveCurveToRelative(7.0f, 3.14f, 7.0f, 7.0f);
        n.reflectiveCurveToRelative(-3.14f, 7.0f, -7.0f, 7.0f);
        n.close();
        n.moveTo(2.0f, 12.0f);
        n.curveToRelative(0.0f, -2.79f, 1.64f, -5.2f, 4.01f, -6.32f);
        n.lineTo(6.01f, 3.52f);
        n.curveTo(2.52f, 4.76f, 0.0f, 8.09f, 0.0f, 12.0f);
        n.reflectiveCurveToRelative(2.52f, 7.24f, 6.01f, 8.48f);
        n.verticalLineToRelative(-2.16f);
        n.curveTo(3.64f, 17.2f, 2.0f, 14.79f, 2.0f, 12.0f);
        n.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, n.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _controlPointDuplicate = build;
        build.getClass();
        return build;
    }
}
