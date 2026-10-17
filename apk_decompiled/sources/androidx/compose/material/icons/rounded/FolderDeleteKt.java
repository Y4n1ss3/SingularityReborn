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
public final class FolderDeleteKt {
    private static ImageVector _folderDelete;

    public static final ImageVector getFolderDelete(Icons.Rounded rounded) {
        ImageVector imageVector = _folderDelete;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FolderDelete", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(16.5f, 15.5f, -2.0f, -4.0f, 2.0f);
        k4.D(n, 15.5f, 20.0f, 6.0f, -8.0f);
        n.lineToRelative(-1.41f, -1.41f);
        n.curveTo(10.21f, 4.21f, 9.7f, 4.0f, 9.17f, 4.0f);
        n.horizontalLineTo(4.0f);
        n.curveTo(2.9f, 4.0f, 2.01f, 4.9f, 2.01f, 6.0f);
        n.lineTo(2.0f, 18.0f);
        n.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        n.horizontalLineToRelative(16.0f);
        n.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        n.verticalLineTo(8.0f);
        n.curveTo(22.0f, 6.9f, 21.1f, 6.0f, 20.0f, 6.0f);
        uo.q(n, 18.25f, 11.5f, 18.0f, 4.0f);
        n.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        n.horizontalLineToRelative(-2.0f);
        n.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        n.verticalLineToRelative(-4.0f);
        n.horizontalLineToRelative(-0.25f);
        n.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        n.curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f);
        n.horizontalLineToRelative(1.75f);
        n.verticalLineTo(9.75f);
        n.curveTo(14.5f, 9.34f, 14.84f, 9.0f, 15.25f, 9.0f);
        n.horizontalLineToRelative(0.5f);
        n.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        n.verticalLineTo(10.0f);
        n.horizontalLineToRelative(1.75f);
        n.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        n.curveTo(19.0f, 11.16f, 18.66f, 11.5f, 18.25f, 11.5f);
        n.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, n.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _folderDelete = build;
        build.getClass();
        return build;
    }
}
