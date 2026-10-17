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
import defpackage.bv;
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BackupKt {
    private static ImageVector _backup;

    public static final ImageVector getBackup(Icons.Rounded rounded) {
        ImageVector imageVector = _backup;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Backup", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(19.0f, 11.0f);
        b.curveToRelative(0.0f, -3.87f, -3.13f, -7.0f, -7.0f, -7.0f);
        b.curveTo(8.78f, 4.0f, 6.07f, 6.18f, 5.26f, 9.15f);
        b.curveTo(2.82f, 9.71f, 1.0f, 11.89f, 1.0f, 14.5f);
        b.curveTo(1.0f, 17.54f, 3.46f, 20.0f, 6.5f, 20.0f);
        b.curveToRelative(1.76f, 0.0f, 10.25f, 0.0f, 12.0f, 0.0f);
        b.lineToRelative(0.0f, 0.0f);
        b.curveToRelative(2.49f, -0.01f, 4.5f, -2.03f, 4.5f, -4.52f);
        b.curveTo(23.0f, 13.15f, 21.25f, 11.26f, 19.0f, 11.0f);
        bv.v(b, 13.0f, 13.0f, 2.0f);
        b.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        b.horizontalLineToRelative(0.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        b.verticalLineToRelative(-2.0f);
        b.horizontalLineTo(9.21f);
        b.curveToRelative(-0.45f, 0.0f, -0.67f, -0.54f, -0.35f, -0.85f);
        b.lineToRelative(2.79f, -2.79f);
        b.curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0.0f);
        b.lineToRelative(2.79f, 2.79f);
        b.curveToRelative(0.31f, 0.31f, 0.09f, 0.85f, -0.35f, 0.85f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.h(b, 13.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _backup = build;
        build.getClass();
        return build;
    }
}
