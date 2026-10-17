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
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AddLocationKt {
    private static ImageVector _addLocation;

    public static final ImageVector getAddLocation(Icons.TwoTone twoTone) {
        ImageVector imageVector = _addLocation;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.AddLocation", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.5f, 10.2f);
        b.curveToRelative(0.0f, 2.57f, -2.1f, 5.79f, -6.16f, 9.51f);
        b.lineTo(12.0f, 20.01f);
        b.lineToRelative(-0.34f, -0.31f);
        b.curveTo(7.6f, 15.99f, 5.5f, 12.77f, 5.5f, 10.2f);
        b.curveToRelative(0.0f, -3.84f, 2.82f, -6.7f, 6.5f, -6.7f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 18.5f, 6.35f, 18.5f, 10.2f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder s = kp0.s(13.0f, 6.0f, 3.0f, 3.0f, 2.0f);
        af0.v(s, -3.0f, 3.0f, -2.0f, -3.0f);
        s.horizontalLineTo(8.0f);
        s.verticalLineTo(9.0f);
        s.horizontalLineToRelative(3.0f);
        s.verticalLineTo(6.0f);
        k4.w(s, 13.0f, 18.0f, 10.2f);
        s.curveTo(18.0f, 6.57f, 15.35f, 4.0f, 12.0f, 4.0f);
        s.reflectiveCurveToRelative(-6.0f, 2.57f, -6.0f, 6.2f);
        s.curveToRelative(0.0f, 2.34f, 1.95f, 5.44f, 6.0f, 9.14f);
        s.curveTo(16.05f, 15.64f, 18.0f, 12.54f, 18.0f, 10.2f);
        s.close();
        s.moveTo(12.0f, 2.0f);
        s.curveToRelative(4.2f, 0.0f, 8.0f, 3.22f, 8.0f, 8.2f);
        s.curveToRelative(0.0f, 3.32f, -2.67f, 7.25f, -8.0f, 11.8f);
        s.curveToRelative(-5.33f, -4.55f, -8.0f, -8.48f, -8.0f, -11.8f);
        s.curveTo(4.0f, 5.22f, 7.8f, 2.0f, 12.0f, 2.0f);
        s.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, s.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addLocation = build;
        build.getClass();
        return build;
    }
}
