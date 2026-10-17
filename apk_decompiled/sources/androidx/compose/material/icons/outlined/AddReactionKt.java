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
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AddReactionKt {
    private static ImageVector _addReaction;

    public static final ImageVector getAddReaction(Icons.Outlined outlined) {
        ImageVector imageVector = _addReaction;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.AddReaction", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(7.0f, 9.5f);
        b.curveTo(7.0f, 8.67f, 7.67f, 8.0f, 8.5f, 8.0f);
        b.reflectiveCurveTo(10.0f, 8.67f, 10.0f, 9.5f);
        b.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        b.reflectiveCurveTo(7.0f, 10.33f, 7.0f, 9.5f);
        b.close();
        b.moveTo(12.0f, 17.5f);
        b.curveToRelative(2.33f, 0.0f, 4.31f, -1.46f, 5.11f, -3.5f);
        b.horizontalLineTo(6.89f);
        b.curveTo(7.69f, 16.04f, 9.67f, 17.5f, 12.0f, 17.5f);
        b.close();
        b.moveTo(15.5f, 11.0f);
        b.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        b.curveTo(17.0f, 8.67f, 16.33f, 8.0f, 15.5f, 8.0f);
        b.reflectiveCurveTo(14.0f, 8.67f, 14.0f, 9.5f);
        b.curveTo(14.0f, 10.33f, 14.67f, 11.0f, 15.5f, 11.0f);
        r6.B(b, 22.0f, 1.0f, -2.0f, 2.0f);
        af0.v(b, -2.0f, 2.0f, 2.0f, 2.0f);
        af0.n(b, 2.0f, 5.0f, 2.0f, 3.0f);
        uo.r(b, -2.0f, 1.0f, 20.0f, 12.0f);
        b.curveToRelative(0.0f, 4.42f, -3.58f, 8.0f, -8.0f, 8.0f);
        b.reflectiveCurveToRelative(-8.0f, -3.58f, -8.0f, -8.0f);
        b.curveToRelative(0.0f, -4.42f, 3.58f, -8.0f, 8.0f, -8.0f);
        b.curveToRelative(1.46f, 0.0f, 2.82f, 0.4f, 4.0f, 1.08f);
        b.verticalLineTo(2.84f);
        b.curveTo(14.77f, 2.3f, 13.42f, 2.0f, 11.99f, 2.0f);
        b.curveTo(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b.curveToRelative(0.0f, 5.52f, 4.47f, 10.0f, 9.99f, 10.0f);
        b.curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
        b.curveToRelative(0.0f, -1.05f, -0.17f, -2.05f, -0.47f, -3.0f);
        b.horizontalLineToRelative(-2.13f);
        b.curveTo(19.78f, 9.93f, 20.0f, 10.94f, 20.0f, 12.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addReaction = build;
        build.getClass();
        return build;
    }
}
