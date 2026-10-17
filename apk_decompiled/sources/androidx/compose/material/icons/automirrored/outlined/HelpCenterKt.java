package androidx.compose.material.icons.automirrored.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.gy;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HelpCenterKt {
    private static ImageVector _helpCenter;

    public static final ImageVector getHelpCenter(Icons.AutoMirrored.Outlined outlined) {
        ImageVector imageVector = _helpCenter;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Outlined.HelpCenter", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(13.25f, 16.74f);
        b.curveToRelative(0.0f, 0.69f, -0.53f, 1.26f, -1.25f, 1.26f);
        b.curveToRelative(-0.7f, 0.0f, -1.26f, -0.56f, -1.26f, -1.26f);
        b.curveToRelative(0.0f, -0.71f, 0.56f, -1.25f, 1.26f, -1.25f);
        b.curveTo(12.71f, 15.49f, 13.25f, 16.04f, 13.25f, 16.74f);
        b.close();
        b.moveTo(11.99f, 6.0f);
        b.curveToRelative(-1.77f, 0.0f, -2.98f, 1.15f, -3.43f, 2.49f);
        b.lineToRelative(1.64f, 0.69f);
        b.curveToRelative(0.22f, -0.67f, 0.74f, -1.48f, 1.8f, -1.48f);
        b.curveToRelative(1.62f, 0.0f, 1.94f, 1.52f, 1.37f, 2.33f);
        b.curveToRelative(-0.54f, 0.77f, -1.47f, 1.29f, -1.96f, 2.16f);
        b.curveToRelative(-0.39f, 0.69f, -0.31f, 1.49f, -0.31f, 1.98f);
        b.horizontalLineToRelative(1.82f);
        b.curveToRelative(0.0f, -0.93f, 0.07f, -1.12f, 0.22f, -1.41f);
        b.curveToRelative(0.39f, -0.72f, 1.11f, -1.06f, 1.87f, -2.17f);
        b.curveToRelative(0.68f, -1.0f, 0.42f, -2.36f, -0.02f, -3.08f);
        b.curveTo(14.48f, 6.67f, 13.47f, 6.0f, 11.99f, 6.0f);
        uo.q(b, 19.0f, 5.0f, 5.0f, 14.0f);
        b.horizontalLineToRelative(14.0f);
        b.verticalLineTo(5.0f);
        b.moveTo(19.0f, 3.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        b.verticalLineToRelative(14.0f);
        b.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        b.horizontalLineTo(5.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        b.verticalLineTo(5.0f);
        b.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.m(b, 19.0f, 19.0f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _helpCenter = build;
        build.getClass();
        return build;
    }
}
