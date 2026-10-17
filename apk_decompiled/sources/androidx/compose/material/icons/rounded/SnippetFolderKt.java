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
import defpackage.fc;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SnippetFolderKt {
    private static ImageVector _snippetFolder;

    public static final ImageVector getSnippetFolder(Icons.Rounded rounded) {
        ImageVector imageVector = _snippetFolder;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SnippetFolder", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = kp0.e(15.88f, 10.5f, 1.62f, 1.62f, 3.38f);
        e.lineToRelative(-3.0f, 0.0f);
        e.verticalLineToRelative(-5.0f);
        e.horizontalLineTo(15.88f);
        e.close();
        e.moveTo(22.0f, 8.0f);
        e.verticalLineToRelative(10.0f);
        e.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        e.horizontalLineTo(4.0f);
        e.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        e.lineTo(2.01f, 6.0f);
        e.curveTo(2.01f, 4.9f, 2.9f, 4.0f, 4.0f, 4.0f);
        e.horizontalLineToRelative(5.17f);
        e.curveToRelative(0.53f, 0.0f, 1.04f, 0.21f, 1.41f, 0.59f);
        e.lineTo(12.0f, 6.0f);
        e.horizontalLineToRelative(8.0f);
        e.curveTo(21.1f, 6.0f, 22.0f, 6.9f, 22.0f, 8.0f);
        e.close();
        e.moveTo(19.0f, 11.91f);
        e.curveToRelative(0.0f, -0.27f, -0.11f, -0.52f, -0.29f, -0.71f);
        e.lineToRelative(-1.91f, -1.91f);
        e.curveTo(16.61f, 9.11f, 16.35f, 9.0f, 16.09f, 9.0f);
        e.horizontalLineTo(14.0f);
        e.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        e.verticalLineToRelative(6.0f);
        e.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        e.lineToRelative(4.0f, 0.0f);
        e.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(e, 11.91f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _snippetFolder = build;
        build.getClass();
        return build;
    }
}
