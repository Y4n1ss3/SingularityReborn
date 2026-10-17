package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.er;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HelpCenterKt {
    private static ImageVector _helpCenter;

    public static final ImageVector getHelpCenter(Icons.Filled filled) {
        ImageVector imageVector = _helpCenter;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.HelpCenter", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(19.0f, 3.0f, 5.0f);
        d.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        d.verticalLineToRelative(14.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(14.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineTo(5.0f);
        d.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        d.close();
        d.moveTo(12.01f, 18.0f);
        d.curveToRelative(-0.7f, 0.0f, -1.26f, -0.56f, -1.26f, -1.26f);
        d.curveToRelative(0.0f, -0.71f, 0.56f, -1.25f, 1.26f, -1.25f);
        d.curveToRelative(0.71f, 0.0f, 1.25f, 0.54f, 1.25f, 1.25f);
        d.curveTo(13.25f, 17.43f, 12.72f, 18.0f, 12.01f, 18.0f);
        d.close();
        d.moveTo(15.02f, 10.6f);
        d.curveToRelative(-0.76f, 1.11f, -1.48f, 1.46f, -1.87f, 2.17f);
        d.curveToRelative(-0.16f, 0.29f, -0.22f, 0.48f, -0.22f, 1.41f);
        d.horizontalLineToRelative(-1.82f);
        d.curveToRelative(0.0f, -0.49f, -0.08f, -1.29f, 0.31f, -1.98f);
        d.curveToRelative(0.49f, -0.87f, 1.42f, -1.39f, 1.96f, -2.16f);
        d.curveToRelative(0.57f, -0.81f, 0.25f, -2.33f, -1.37f, -2.33f);
        d.curveToRelative(-1.06f, 0.0f, -1.58f, 0.8f, -1.8f, 1.48f);
        d.lineTo(8.56f, 8.49f);
        d.curveTo(9.01f, 7.15f, 10.22f, 6.0f, 11.99f, 6.0f);
        d.curveToRelative(1.48f, 0.0f, 2.49f, 0.67f, 3.01f, 1.52f);
        d.curveTo(15.44f, 8.24f, 15.7f, 9.59f, 15.02f, 10.6f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _helpCenter = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getHelpCenter$annotations(Icons.Filled filled) {
    }
}
