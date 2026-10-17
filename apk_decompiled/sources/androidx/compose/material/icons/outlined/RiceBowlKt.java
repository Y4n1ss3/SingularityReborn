package androidx.compose.material.icons.outlined;

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

    public static final ImageVector getRiceBowl(Icons.Outlined outlined) {
        ImageVector imageVector = _riceBowl;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.RiceBowl", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(19.66f, 14.0f);
        b.curveToRelative(-0.66f, 1.92f, -2.24f, 3.54f, -4.4f, 4.39f);
        fc.t(b, 14.0f, 18.88f, 20.0f, -4.0f);
        b.verticalLineToRelative(-1.12f);
        b.lineToRelative(-1.27f, -0.5f);
        b.curveToRelative(-2.16f, -0.85f, -3.74f, -2.47f, -4.4f, -4.39f);
        b.horizontalLineTo(19.66f);
        b.moveTo(12.0f, 2.0f);
        b.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b.curveToRelative(0.0f, 3.69f, 2.47f, 6.86f, 6.0f, 8.25f);
        kf0.r(b, 22.0f, 8.0f, -1.75f);
        b.curveToRelative(3.53f, -1.39f, 6.0f, -4.56f, 6.0f, -8.25f);
        b.horizontalLineToRelative(0.0f);
        b.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        uo.l(b, 12.0f, 2.0f, 10.0f, 12.0f);
        b.verticalLineTo(4.26f);
        b.curveTo(10.64f, 4.1f, 11.31f, 4.0f, 12.0f, 4.0f);
        b.reflectiveCurveToRelative(1.36f, 0.1f, 2.0f, 0.26f);
        b.verticalLineTo(12.0f);
        b.horizontalLineTo(10.0f);
        b.lineTo(10.0f, 12.0f);
        b.close();
        b.moveTo(16.0f, 12.0f);
        b.verticalLineTo(5.08f);
        b.curveToRelative(2.39f, 1.39f, 4.0f, 3.96f, 4.0f, 6.92f);
        kf0.m(b, 16.0f, 16.0f, 12.0f);
        b.moveTo(4.0f, 12.0f);
        b.curveToRelative(0.0f, -2.95f, 1.61f, -5.53f, 4.0f, -6.92f);
        b.verticalLineTo(12.0f);
        b.horizontalLineTo(4.0f);
        b.lineTo(4.0f, 12.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _riceBowl = build;
        build.getClass();
        return build;
    }
}
