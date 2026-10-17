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
import defpackage.er;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HelpOutlineKt {
    private static ImageVector _helpOutline;

    public static final ImageVector getHelpOutline(Icons.TwoTone twoTone) {
        ImageVector imageVector = _helpOutline;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.HelpOutline", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder q = uf.q(11.0f, 16.0f, 2.0f, 2.0f, -2.0f);
        q.moveTo(12.0f, 2.0f);
        q.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        q.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        q.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        q.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        q.close();
        q.moveTo(12.0f, 20.0f);
        q.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        q.reflectiveCurveToRelative(3.59f, -8.0f, 8.0f, -8.0f);
        q.reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f);
        q.reflectiveCurveToRelative(-3.59f, 8.0f, -8.0f, 8.0f);
        q.close();
        q.moveTo(12.0f, 6.0f);
        q.curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        q.horizontalLineToRelative(2.0f);
        q.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        q.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        q.curveToRelative(0.0f, 2.0f, -3.0f, 1.75f, -3.0f, 5.0f);
        q.horizontalLineToRelative(2.0f);
        q.curveToRelative(0.0f, -2.25f, 3.0f, -2.5f, 3.0f, -5.0f);
        q.curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
        q.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, q.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _helpOutline = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getHelpOutline$annotations(Icons.TwoTone twoTone) {
    }
}
