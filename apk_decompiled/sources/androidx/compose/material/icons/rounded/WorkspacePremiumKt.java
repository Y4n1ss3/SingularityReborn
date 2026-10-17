package androidx.compose.material.icons.rounded;

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
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WorkspacePremiumKt {
    private static ImageVector _workspacePremium;

    public static final ImageVector getWorkspacePremium(Icons.Rounded rounded) {
        ImageVector imageVector = _workspacePremium;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.WorkspacePremium", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(10.92f, 12.75f, 12.0f, 11.93f);
        i.lineToRelative(1.07f, 0.81f);
        i.curveToRelative(0.39f, 0.29f, 0.92f, -0.08f, 0.78f, -0.55f);
        i.lineToRelative(-0.42f, -1.36f);
        i.lineToRelative(1.2f, -0.95f);
        i.curveTo(15.0f, 9.6f, 14.79f, 9.0f, 14.31f, 9.0f);
        i.horizontalLineToRelative(-1.4f);
        i.lineToRelative(-0.43f, -1.34f);
        i.curveToRelative(-0.15f, -0.46f, -0.8f, -0.46f, -0.95f, 0.0f);
        i.lineTo(11.09f, 9.0f);
        i.horizontalLineTo(9.68f);
        i.curveTo(9.21f, 9.0f, 9.0f, 9.6f, 9.37f, 9.89f);
        i.lineToRelative(1.19f, 0.95f);
        i.lineToRelative(-0.42f, 1.36f);
        i.curveTo(10.0f, 12.67f, 10.53f, 13.04f, 10.92f, 12.75f);
        i.close();
        i.moveTo(6.0f, 21.61f);
        i.curveToRelative(0.0f, 0.68f, 0.67f, 1.16f, 1.32f, 0.95f);
        i.lineTo(12.0f, 21.0f);
        i.lineToRelative(4.68f, 1.56f);
        i.curveTo(17.33f, 22.78f, 18.0f, 22.3f, 18.0f, 21.61f);
        i.verticalLineToRelative(-6.33f);
        i.curveToRelative(1.24f, -1.41f, 2.0f, -3.25f, 2.0f, -5.28f);
        i.curveToRelative(0.0f, -4.42f, -3.58f, -8.0f, -8.0f, -8.0f);
        i.reflectiveCurveToRelative(-8.0f, 3.58f, -8.0f, 8.0f);
        i.curveToRelative(0.0f, 2.03f, 0.76f, 3.87f, 2.0f, 5.28f);
        bv.t(i, 21.61f, 12.0f, 4.0f);
        i.curveToRelative(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f);
        i.reflectiveCurveToRelative(-2.69f, 6.0f, -6.0f, 6.0f);
        i.reflectiveCurveToRelative(-6.0f, -2.69f, -6.0f, -6.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(i, 8.69f, 4.0f, 12.0f, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _workspacePremium = build;
        build.getClass();
        return build;
    }
}
