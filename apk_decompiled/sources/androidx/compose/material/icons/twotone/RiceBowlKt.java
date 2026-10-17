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
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RiceBowlKt {
    private static ImageVector _riceBowl;

    public static final ImageVector getRiceBowl(Icons.TwoTone twoTone) {
        ImageVector imageVector = _riceBowl;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.RiceBowl", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(19.66f, 14.0f);
        b.curveToRelative(-0.66f, 1.92f, -2.24f, 3.54f, -4.4f, 4.39f);
        fc.t(b, 14.0f, 18.88f, 20.0f, -4.0f);
        b.verticalLineToRelative(-1.12f);
        b.lineToRelative(-1.27f, -0.5f);
        b.curveToRelative(-2.16f, -0.85f, -3.74f, -2.47f, -4.4f, -4.39f);
        b.horizontalLineTo(19.66f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(19.66f, 14.0f);
        b2.curveToRelative(-0.66f, 1.92f, -2.24f, 3.54f, -4.4f, 4.39f);
        fc.t(b2, 14.0f, 18.88f, 20.0f, -4.0f);
        b2.verticalLineToRelative(-1.12f);
        b2.lineToRelative(-1.27f, -0.5f);
        b2.curveToRelative(-2.16f, -0.85f, -3.74f, -2.47f, -4.4f, -4.39f);
        b2.horizontalLineTo(19.66f);
        b2.moveTo(12.0f, 2.0f);
        b2.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b2.curveToRelative(0.0f, 3.69f, 2.47f, 6.86f, 6.0f, 8.25f);
        kf0.r(b2, 22.0f, 8.0f, -1.75f);
        b2.curveToRelative(3.53f, -1.39f, 6.0f, -4.56f, 6.0f, -8.25f);
        b2.horizontalLineToRelative(0.0f);
        b2.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        uo.l(b2, 12.0f, 2.0f, 10.0f, 12.0f);
        b2.verticalLineTo(4.26f);
        b2.curveTo(10.64f, 4.1f, 11.31f, 4.0f, 12.0f, 4.0f);
        b2.reflectiveCurveToRelative(1.36f, 0.1f, 2.0f, 0.26f);
        b2.verticalLineTo(12.0f);
        b2.horizontalLineTo(10.0f);
        b2.lineTo(10.0f, 12.0f);
        b2.close();
        b2.moveTo(16.0f, 12.0f);
        b2.verticalLineTo(5.08f);
        b2.curveToRelative(2.39f, 1.39f, 4.0f, 3.96f, 4.0f, 6.92f);
        kf0.m(b2, 16.0f, 16.0f, 12.0f);
        b2.moveTo(4.0f, 12.0f);
        b2.curveToRelative(0.0f, -2.95f, 1.61f, -5.53f, 4.0f, -6.92f);
        b2.verticalLineTo(12.0f);
        b2.horizontalLineTo(4.0f);
        b2.lineTo(4.0f, 12.0f);
        b2.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _riceBowl = build;
        build.getClass();
        return build;
    }
}
