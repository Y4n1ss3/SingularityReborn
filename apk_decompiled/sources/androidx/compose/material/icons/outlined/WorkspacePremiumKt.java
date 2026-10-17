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
import defpackage.af0;
import defpackage.bv;
import defpackage.gy;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WorkspacePremiumKt {
    private static ImageVector _workspacePremium;

    public static final ImageVector getWorkspacePremium(Icons.Outlined outlined) {
        ImageVector imageVector = _workspacePremium;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.WorkspacePremium", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(9.68f, 13.69f, 12.0f, 11.93f);
        i.lineToRelative(2.31f, 1.76f);
        i.lineToRelative(-0.88f, -2.85f);
        i.lineTo(15.75f, 9.0f);
        i.horizontalLineToRelative(-2.84f);
        i.lineTo(12.0f, 6.19f);
        i.lineTo(11.09f, 9.0f);
        i.horizontalLineTo(8.25f);
        gy.B(i, 2.31f, 1.84f, 9.68f, 13.69f);
        i.moveTo(20.0f, 10.0f);
        i.curveToRelative(0.0f, -4.42f, -3.58f, -8.0f, -8.0f, -8.0f);
        i.reflectiveCurveToRelative(-8.0f, 3.58f, -8.0f, 8.0f);
        i.curveToRelative(0.0f, 2.03f, 0.76f, 3.87f, 2.0f, 5.28f);
        i.verticalLineTo(23.0f);
        i.lineToRelative(6.0f, -2.0f);
        i.lineToRelative(6.0f, 2.0f);
        i.verticalLineToRelative(-7.72f);
        i.curveTo(19.24f, 13.87f, 20.0f, 12.03f, 20.0f, 10.0f);
        i.close();
        i.moveTo(12.0f, 4.0f);
        i.curveToRelative(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f);
        i.reflectiveCurveToRelative(-2.69f, 6.0f, -6.0f, 6.0f);
        i.reflectiveCurveToRelative(-6.0f, -2.69f, -6.0f, -6.0f);
        i.reflectiveCurveTo(8.69f, 4.0f, 12.0f, 4.0f);
        k4.x(i, 12.0f, 19.0f, -4.0f, 1.02f);
        i.verticalLineToRelative(-3.1f);
        i.curveTo(9.18f, 17.6f, 10.54f, 18.0f, 12.0f, 18.0f);
        i.reflectiveCurveToRelative(2.82f, -0.4f, 4.0f, -1.08f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.j(i, 3.1f, 12.0f, 19.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _workspacePremium = build;
        build.getClass();
        return build;
    }
}
