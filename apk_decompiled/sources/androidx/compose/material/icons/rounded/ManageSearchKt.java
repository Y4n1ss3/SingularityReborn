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
import defpackage.er;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ManageSearchKt {
    private static ImageVector _manageSearch;

    public static final ImageVector getManageSearch(Icons.Rounded rounded) {
        ImageVector imageVector = _manageSearch;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ManageSearch", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(6.0f, 9.0f, 3.0f);
        d.curveTo(2.45f, 9.0f, 2.0f, 8.55f, 2.0f, 8.0f);
        d.verticalLineToRelative(0.0f);
        d.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        d.horizontalLineToRelative(3.0f);
        d.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        d.verticalLineToRelative(0.0f);
        d.curveTo(7.0f, 8.55f, 6.55f, 9.0f, 6.0f, 9.0f);
        r6.g(d, 6.0f, 12.0f, 3.0f);
        d.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        d.verticalLineToRelative(0.0f);
        d.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        d.horizontalLineToRelative(3.0f);
        d.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        d.verticalLineToRelative(0.0f);
        d.curveTo(7.0f, 12.45f, 6.55f, 12.0f, 6.0f, 12.0f);
        k4.x(d, 19.88f, 18.29f, -3.12f, -3.12f);
        d.curveToRelative(-0.86f, 0.56f, -1.89f, 0.88f, -3.0f, 0.82f);
        d.curveToRelative(-2.37f, -0.11f, -4.4f, -1.96f, -4.72f, -4.31f);
        d.curveTo(8.6f, 8.33f, 11.49f, 5.5f, 14.87f, 6.07f);
        d.curveToRelative(1.95f, 0.33f, 3.57f, 1.85f, 4.0f, 3.78f);
        d.curveToRelative(0.33f, 1.46f, 0.01f, 2.82f, -0.7f, 3.9f);
        d.lineToRelative(3.13f, 3.13f);
        d.curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        d.lineToRelative(0.0f, 0.0f);
        d.curveTo(20.91f, 18.68f, 20.27f, 18.68f, 19.88f, 18.29f);
        d.close();
        d.moveTo(17.0f, 11.0f);
        d.curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f);
        d.reflectiveCurveToRelative(-3.0f, 1.35f, -3.0f, 3.0f);
        d.reflectiveCurveToRelative(1.35f, 3.0f, 3.0f, 3.0f);
        d.reflectiveCurveTo(17.0f, 12.65f, 17.0f, 11.0f);
        af0.l(d, 3.0f, 19.0f, 8.0f);
        d.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        d.verticalLineToRelative(0.0f);
        d.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        d.horizontalLineTo(3.0f);
        d.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        d.verticalLineToRelative(0.0f);
        d.curveTo(2.0f, 18.55f, 2.45f, 19.0f, 3.0f, 19.0f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _manageSearch = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getManageSearch$annotations(Icons.Rounded rounded) {
    }
}
