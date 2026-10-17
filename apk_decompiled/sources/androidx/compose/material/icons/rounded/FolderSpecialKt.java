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
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FolderSpecialKt {
    private static ImageVector _folderSpecial;

    public static final ImageVector getFolderSpecial(Icons.Rounded rounded) {
        ImageVector imageVector = _folderSpecial;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FolderSpecial", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = uo.i(20.0f, 6.0f, -8.0f, -1.41f, -1.41f);
        i.curveTo(10.21f, 4.21f, 9.7f, 4.0f, 9.17f, 4.0f);
        i.lineTo(4.0f, 4.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        i.verticalLineToRelative(12.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(16.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.lineTo(22.0f, 8.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.r(i, 16.94f, 16.41f, 15.0f, 15.28f);
        i.lineToRelative(-1.94f, 1.13f);
        i.curveToRelative(-0.38f, 0.22f, -0.84f, -0.12f, -0.74f, -0.55f);
        i.lineToRelative(0.51f, -2.2f);
        i.lineToRelative(-1.69f, -1.46f);
        i.curveToRelative(-0.33f, -0.29f, -0.16f, -0.84f, 0.28f, -0.88f);
        i.lineToRelative(2.23f, -0.19f);
        i.lineToRelative(0.88f, -2.06f);
        i.curveToRelative(0.17f, -0.4f, 0.75f, -0.4f, 0.92f, 0.0f);
        i.lineToRelative(0.88f, 2.06f);
        i.lineToRelative(2.23f, 0.19f);
        i.curveToRelative(0.44f, 0.04f, 0.62f, 0.59f, 0.28f, 0.88f);
        i.lineToRelative(-1.69f, 1.46f);
        i.lineToRelative(0.51f, 2.2f);
        i.curveToRelative(0.11f, 0.43f, -0.35f, 0.77f, -0.72f, 0.55f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _folderSpecial = build;
        build.getClass();
        return build;
    }
}
