package androidx.compose.ui.res;

import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.compose.ui.graphics.vector.ImageVector;
import defpackage.fc;
import defpackage.q10;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ImageVectorCache {
    public static final int $stable = 8;
    private final HashMap<Key, WeakReference<ImageVectorEntry>> map = new HashMap<>();

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class ImageVectorEntry {
        public static final int $stable = 0;
        private final int configFlags;
        private final ImageVector imageVector;

        public ImageVectorEntry(ImageVector imageVector, int i) {
            this.imageVector = imageVector;
            this.configFlags = i;
        }

        public static /* synthetic */ ImageVectorEntry copy$default(ImageVectorEntry imageVectorEntry, ImageVector imageVector, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                imageVector = imageVectorEntry.imageVector;
            }
            if ((i2 & 2) != 0) {
                i = imageVectorEntry.configFlags;
            }
            return imageVectorEntry.copy(imageVector, i);
        }

        public final ImageVector component1() {
            return this.imageVector;
        }

        public final int component2() {
            return this.configFlags;
        }

        public final ImageVectorEntry copy(ImageVector imageVector, int i) {
            return new ImageVectorEntry(imageVector, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageVectorEntry)) {
                return false;
            }
            ImageVectorEntry imageVectorEntry = (ImageVectorEntry) obj;
            return q10.b(this.imageVector, imageVectorEntry.imageVector) && this.configFlags == imageVectorEntry.configFlags;
        }

        public final int getConfigFlags() {
            return this.configFlags;
        }

        public final ImageVector getImageVector() {
            return this.imageVector;
        }

        public int hashCode() {
            return Integer.hashCode(this.configFlags) + (this.imageVector.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ImageVectorEntry(imageVector=");
            sb.append(this.imageVector);
            sb.append(", configFlags=");
            return fc.e(sb, this.configFlags, ')');
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Key {
        public static final int $stable = 8;
        private final int id;
        private final Resources.Theme theme;

        public Key(Resources.Theme theme, int i) {
            this.theme = theme;
            this.id = i;
        }

        public static /* synthetic */ Key copy$default(Key key, Resources.Theme theme, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                theme = key.theme;
            }
            if ((i2 & 2) != 0) {
                i = key.id;
            }
            return key.copy(theme, i);
        }

        public final Resources.Theme component1() {
            return this.theme;
        }

        public final int component2() {
            return this.id;
        }

        public final Key copy(Resources.Theme theme, int i) {
            return new Key(theme, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            return q10.b(this.theme, key.theme) && this.id == key.id;
        }

        public final int getId() {
            return this.id;
        }

        public final Resources.Theme getTheme() {
            return this.theme;
        }

        public int hashCode() {
            return Integer.hashCode(this.id) + (this.theme.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Key(theme=");
            sb.append(this.theme);
            sb.append(", id=");
            return fc.e(sb, this.id, ')');
        }
    }

    public final void clear() {
        this.map.clear();
    }

    public final ImageVectorEntry get(Key key) {
        WeakReference<ImageVectorEntry> weakReference = this.map.get(key);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void prune(int i) {
        Iterator<Map.Entry<Key, WeakReference<ImageVectorEntry>>> it = this.map.entrySet().iterator();
        while (it.hasNext()) {
            ImageVectorEntry imageVectorEntry = it.next().getValue().get();
            if (imageVectorEntry == null || Configuration.needNewResources(i, imageVectorEntry.getConfigFlags())) {
                it.remove();
            }
        }
    }

    public final void set(Key key, ImageVectorEntry imageVectorEntry) {
        this.map.put(key, new WeakReference<>(imageVectorEntry));
    }
}
