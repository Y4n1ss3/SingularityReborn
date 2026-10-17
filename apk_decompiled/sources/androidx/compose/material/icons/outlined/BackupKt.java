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
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BackupKt {
    private static ImageVector _backup;

    public static final ImageVector getBackup(Icons.Outlined outlined) {
        ImageVector imageVector = _backup;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Backup", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(19.35f, 10.04f);
        b.curveTo(18.67f, 6.59f, 15.64f, 4.0f, 12.0f, 4.0f);
        b.curveTo(9.11f, 4.0f, 6.6f, 5.64f, 5.35f, 8.04f);
        b.curveTo(2.34f, 8.36f, 0.0f, 10.91f, 0.0f, 14.0f);
        b.curveToRelative(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f);
        b.horizontalLineToRelative(13.0f);
        b.curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        b.curveToRelative(0.0f, -2.64f, -2.05f, -4.78f, -4.65f, -4.96f);
        r6.g(b, 19.0f, 18.0f, 6.0f);
        b.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        b.curveToRelative(0.0f, -2.05f, 1.53f, -3.76f, 3.56f, -3.97f);
        b.lineToRelative(1.07f, -0.11f);
        b.lineToRelative(0.5f, -0.95f);
        b.curveTo(8.08f, 7.14f, 9.94f, 6.0f, 12.0f, 6.0f);
        b.curveToRelative(2.62f, 0.0f, 4.88f, 1.86f, 5.39f, 4.43f);
        b.lineToRelative(0.3f, 1.5f);
        b.lineToRelative(1.53f, 0.11f);
        b.curveToRelative(1.56f, 0.1f, 2.78f, 1.41f, 2.78f, 2.96f);
        b.curveToRelative(0.0f, 1.65f, -1.35f, 3.0f, -3.0f, 3.0f);
        r6.B(b, 8.0f, 13.0f, 2.55f, 3.0f);
        k4.k(b, 2.9f, -3.0f, 16.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.g(b, -4.0f, -4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _backup = build;
        build.getClass();
        return build;
    }
}
