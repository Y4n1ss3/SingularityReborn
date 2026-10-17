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
import defpackage.j50;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class OpenInFullKt {
    private static ImageVector _openInFull;

    public static final ImageVector getOpenInFull(Icons.Rounded rounded) {
        ImageVector imageVector = _openInFull;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.OpenInFull", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(21.0f, 8.59f, 4.0f);
        d.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        d.horizontalLineToRelative(-4.59f);
        d.curveToRelative(-0.89f, 0.0f, -1.34f, 1.08f, -0.71f, 1.71f);
        d.lineToRelative(1.59f, 1.59f);
        d.lineToRelative(-10.0f, 10.0f);
        d.lineToRelative(-1.59f, -1.59f);
        d.curveTo(4.08f, 14.08f, 3.0f, 14.52f, 3.0f, 15.41f);
        d.verticalLineTo(20.0f);
        d.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        d.horizontalLineToRelative(4.59f);
        d.curveToRelative(0.89f, 0.0f, 1.34f, -1.08f, 0.71f, -1.71f);
        d.lineToRelative(-1.59f, -1.59f);
        d.lineToRelative(10.0f, -10.0f);
        d.lineToRelative(1.59f, 1.59f);
        d.curveTo(19.92f, 9.92f, 21.0f, 9.48f, 21.0f, 8.59f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _openInFull = build;
        build.getClass();
        return build;
    }
}
